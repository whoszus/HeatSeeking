package cc.tinker.service;

import com.gosuncn.core.entity.BtrapPage;
import com.gosuncn.core.repository.DynamicOperator;
import com.gosuncn.core.repository.DynamicQueryConstructor;
import com.gosuncn.core.repository.DynamicQueryJpa;
import com.gosuncn.core.repository.LogicalExpression;
import com.gosuncn.core.service.BaseService;
import cc.tinker.entity.*;
import cc.tinker.repostory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class JzPersonCaseService extends BaseService<JzPersonCaseEntity,String> {
    protected JzPersonCaseRepository getJzPersonCaseRepository(){
		return (JzPersonCaseRepository)baseRepository;
	}

	@Autowired
	JzCaseCriminalRepository jzCaseCriminalRepository;

	@Autowired
	JzCasePersonRepository jzCasePersonRepository;

	@Autowired
    JzPersonCaseRepository jzPersonCaseRepository;

	@Autowired
	JzCaseInfoEntityRepository jzCaseInfoEntityRepository;
	@Autowired
    JzCaseDetailEntityRepository jzCaseDetailEntityRepository;

	public <T> BtrapPage<T> getPersonCaseByName(String name, String type, Map<String, Object> searchParams,
                                                int pageNumber, int pageSize){

		List<String> allPersonList = jzCaseCriminalRepository.getCaseNumByName(name); //名字查出案件编号
		List<String> jzPersonCaseBHStrings = jzCasePersonRepository.getCaseNumByName(name); //名字查出案件编号
		allPersonList.addAll(jzPersonCaseBHStrings);
		Page<T> result =null;
		if(type.equals("detail")){
			for(int i=0;i<allPersonList.size();i++){
				if(allPersonList.get(i).startsWith("J")){
					allPersonList.remove(i);
				}
			}
			if(allPersonList.size()!=0){
				Pageable pageable = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "createdtime");
				DynamicQueryJpa<JzCaseDetailEntity> dq = new DynamicQueryJpa<JzCaseDetailEntity>();
				List<DynamicOperator> ld = DynamicQueryConstructor.parse(searchParams);
				for (DynamicOperator dp : ld) {
					dq.add(dp);
				}
				LogicalExpression logicalExpression = DynamicQueryConstructor.in("ajbh",allPersonList,true);
				dq.add(logicalExpression);
				result = (Page<T>) jzCaseDetailEntityRepository.findAll(dq, pageable);
			}
		}else if(type.equals("info")){
			for(int i=0;i<allPersonList.size();i++){
				if(allPersonList.get(i).startsWith("A")){
					allPersonList.remove(i);
				}
			}
			if(allPersonList.size()!=0) {
				Pageable pageable = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "createdtime");
				DynamicQueryJpa<JzCaseInfoEntity> dq = new DynamicQueryJpa<JzCaseInfoEntity>();
				List<DynamicOperator> ld = DynamicQueryConstructor.parse(searchParams);
				for (DynamicOperator dp : ld) {
					dq.add(dp);
				}
				LogicalExpression logicalExpression = DynamicQueryConstructor.in("ajbh", allPersonList, true);
				dq.add(logicalExpression);
				result = (Page<T>) jzCaseInfoEntityRepository.findAll(dq, pageable);
			}
//			return new BtrapPage<JzCaseInfoEntity>(result.getContent(), result.getTotalElements(), pageSize, pageNumber);
		}
		return new BtrapPage<T>(result!=null?result.getContent():null, result!=null?result.getTotalElements():0, pageSize, pageNumber);



	}

}