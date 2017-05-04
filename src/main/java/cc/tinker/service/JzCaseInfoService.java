package cc.tinker.service;

import com.gosuncn.core.service.BaseService;
import cc.tinker.entity.JzCaseInfo;
import cc.tinker.repostory.JzCaseInfoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class JzCaseInfoService extends BaseService<JzCaseInfo,String> {
    protected JzCaseInfoRepository getJzCaseInfoRepository(){
		return (JzCaseInfoRepository)baseRepository;
	}
}