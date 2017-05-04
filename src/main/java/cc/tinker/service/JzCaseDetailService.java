package cc.tinker.service;

import com.gosuncn.core.service.BaseService;
import cc.tinker.entity.JzCaseDetail;
import cc.tinker.repostory.JzCaseDetailRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class JzCaseDetailService extends BaseService<JzCaseDetail,String> {
    protected JzCaseDetailRepository getJzCaseDetailRepository(){
		return (JzCaseDetailRepository)baseRepository;
	}
    
    public void setIsImported(String ajbh){
    	getJzCaseDetailRepository().setIsImported(ajbh);
    }
    
    public JzCaseDetail getCaseByAjbh(String ajbh){
    	return getJzCaseDetailRepository().findOneCase(ajbh);
    }
    
}