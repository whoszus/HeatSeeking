package cc.tinker.repository;

import cc.tinker.entity.IpAccessListEntity;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Tinker on 2017/5/3.
 */
public interface IpAccessRepository extends BaseRepository<IpAccessListEntity,Integer> {

    @Query("from IpAccessListEntity ip where ip.ipAddr = ?1 and ip.isAccessable=0")
    IpAccessListEntity isBlackIpListContains(String ip);

}
