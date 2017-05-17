package cc.tinker.entry.repository;

import cc.tinker.entry.utils.Collections3;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: DynamicSpecifications
 * @Description: 动态设置查询条件
 * @author lwh
 * @date 2015-6-25 下午1:34:56
 *
 */
public class DynamicSpecifications {
    public static <T> Specification<T> bySearchFilter(final Collection<SearchFilter> filters, final Class<?> clazz) {
        return new Specification<T>() {
            
			@SuppressWarnings("unchecked")
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
                if (Collections3.isNotEmpty(filters)) {

                    List<Predicate> predicates = Lists.newArrayList();
                    for (SearchFilter filter : filters) {
                        // nested path translate, 如Task的名为"user.name"的filedName, 转换为Task.user.name属性
                        predicates.add(getPredicate(root,builder,filter));
                        // logic operator
                    }

                    // 将所有条件用 and 联合起来
                    if (predicates.size() > 0) {
                        return builder.and(predicates.toArray(new Predicate[predicates.size()]));
                    }
                }

                return builder.conjunction();
            }
			private Predicate getPredicate(Root<T> root, CriteriaBuilder builder, SearchFilter filter){
				String[] names = StringUtils.split(filter.fieldName, ".");
				Path expression=null;
				if(!filter.operator.equals(SearchFilter.Operator.OR) && !filter.operator.equals(SearchFilter.Operator.AND))
				expression = root.get(names[0]);
                for (int i = 1; i < names.length; i++) {
                    expression = expression.get(names[i]);
                }
				Predicate predicate = null;
				switch (filter.operator) {
                case EQ:
                    predicate=builder.equal(expression, filter.value);
                    break;
                case LIKE:
                    predicate=builder.like(expression, "%" + filter.value + "%");
                    break;
                case GT:
                    predicate=builder.greaterThan(expression, (Comparable) filter.value);
                    break;
                case LT:
                    predicate=builder.lessThan(expression, (Comparable) filter.value);
                    break;
                case GTE:
                    predicate=builder.greaterThanOrEqualTo(expression, (Comparable) filter.value);
                    break;
                case LTE:
                    predicate=builder.lessThanOrEqualTo(expression, (Comparable) filter.value);
                    break;
                case NEQ:
                    predicate=builder.notEqual(expression, (Comparable) filter.value);
                    break;
                case IN:
                	predicate=builder.in(expression).value((List)filter.value);
//                	In in = builder.in(expression);
//                	List list = (List) filter.value;
//                	Iterator iterator = list.iterator();
//                	while (iterator.hasNext()) {
//                         in.value(iterator.next());
//                    }
//                    predicate=in;
                    break;
                case AND:
                case OR:
                	List<Predicate> p = Lists.newArrayList();
                	Map<String, SearchFilter> filters = SearchFilter.parse((Map<String,Object>)filter.value);
                	for(String key:filters.keySet()){
                		p.add(getPredicate(root,builder,filters.get(key)));
                	}
                	Predicate[] pres = new Predicate[filters.size()];
                	p.toArray(pres);
                	predicate=filter.operator.equals(SearchFilter.Operator.OR)?builder.or(pres):builder.and(pres);
                	break;
                }
				return predicate;
			}
        };
    }
}
