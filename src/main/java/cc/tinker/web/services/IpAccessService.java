package cc.tinker.web.services;

import cc.tinker.entry.repository.SearchFilter;
import cc.tinker.web.entity.IpAccessListEntity;
import cc.tinker.web.entity.AccessHistoryEntity;
import cc.tinker.web.entity.SiteEncodePasswordEntity;
import cc.tinker.web.repository.IpAccessRepository;
import cc.tinker.web.repository.RedSwordAccessHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Tinker on 2017/5/3.
 */
@Service
public class IpAccessService {

    @Autowired
    IpAccessRepository ipAccessRepository;

    @Autowired
    RedSwordAccessHistoryRepository accessHistoryRepository;

    /**
     * ip是否在黑名单中
     * @param ip
     * @return
     */
    public boolean IpAccessRecord(String ip) {
        IpAccessListEntity ipAccessListEntity = ipAccessRepository.isBlackIpListContains(ip);
        if (ipAccessListEntity != null) {
            return false;
        }
        return true;
    }


    /**
     * 保存访问历史
     * @param accessHistoryEntity
     */
    public void saveAccessHistory(AccessHistoryEntity accessHistoryEntity){
        accessHistoryRepository.save(accessHistoryEntity);
    }


    public Page<AccessHistoryEntity> accessHistoryList(Map<String, Object> searchParams, int pageNumber, int pageSize, String sortType){
        PageRequest pageRequest = SearchFilter.buildPageRequest(pageNumber, pageSize, sortType, "id");
        Specification<AccessHistoryEntity> spec = SearchFilter.buildSpecification(searchParams, new AccessHistoryEntity());
        return accessHistoryRepository.findAll(spec,pageRequest);
    }
}
