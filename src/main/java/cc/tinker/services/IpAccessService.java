package cc.tinker.services;

import cc.tinker.entity.IpAccessListEntity;
import cc.tinker.entity.RedswordAccessHistoryEntity;
import cc.tinker.repository.IpAccessRepository;
import cc.tinker.repository.RedSwordAccessHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void saveAccessHistory(RedswordAccessHistoryEntity accessHistoryEntity){
        accessHistoryRepository.save(accessHistoryEntity);
    }
}
