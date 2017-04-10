package tinker.entr.repository;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @ClassName: SearchFilter
 * @Description: 条件过滤操作
 * @author lwh
 * @date 2015-6-25 下午1:35:25
 *
 */
public class SearchFilter<SiteEncodePasswordEntity> {

	public enum Operator {
		EQ, LIKE, GT, LT, GTE, LTE, NEQ, IN, OR, AND
	}

	public String fieldName;
	public Object value;
	public Operator operator;

	public SearchFilter(String fieldName, Operator operator, Object value) {
		this.fieldName = fieldName;
		this.value = value;
		this.operator = operator;
	}

	/**
	 * searchParams中key的格式为OPERATOR_FIELDNAME
	 */
	public static Map<String, SearchFilter> parse(Map<String, Object> searchParams) {
		Map<String, SearchFilter> filters = Maps.newHashMap();
		for (Entry<String, Object> entry : searchParams.entrySet()) {
			// 过滤掉空值
			String key = entry.getKey();
			Object value = entry.getValue();
			if(value instanceof List<?>){
				
				if(((ArrayList)value).isEmpty())
					continue;
			}else if(value instanceof Map){
				if(((Map)value).isEmpty()){
					continue;
				}
			}else if (!(value instanceof String)){
			}else if (StringUtils.isBlank((String) value)) {
				continue;
			}

			// 拆分operator与filedAttribute
			String[] names = StringUtils.split(key, "_");
			if (names.length != 2) {
				throw new IllegalArgumentException(key + " is not a valid search filter name");
			}
			String filedName = names[1];
			Operator operator = Operator.valueOf(names[0]);

			// 创建searchFilter
			SearchFilter filter = new SearchFilter(filedName, operator, value);
			filters.put(key, filter);
		}

		return filters;
	}

	/**
	 * 创建分页请求.
	 */
	public static PageRequest buildPageRequest(int pageNumber, int pagzSize, String sortType,String sortBy) {
		Sort sort = null;
		if ("auto".equals(sortType)) {
			sort = new Sort(Sort.Direction.DESC, sortBy);
		}
		return new PageRequest(pageNumber - 1, pagzSize, sort);
	}
	/**
	 * 创建动态查询条件组合.
	 */
	public static <S> Specification<S> buildSpecification(Map<String, Object> searchParams,S s) {
		Map<String, SearchFilter> filters = SearchFilter.parse(searchParams);
		Specification<S> spec = DynamicSpecifications.bySearchFilter(filters.values(),s.getClass());
		return spec;
	}
}
