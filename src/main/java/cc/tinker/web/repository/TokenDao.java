package cc.tinker.web.repository;

import cc.tinker.web.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Tinker on 2016/12/16.
 */
public interface TokenDao extends PagingAndSortingRepository<TokenEntity, Integer>,
        JpaSpecificationExecutor<TokenEntity> {

    @Query("from TokenEntity t where t.token =?1 and t.activeTime >= ?2 ")
    TokenEntity findOneByToken(String token, Date activeTime);

    @Query("from TokenEntity t where t.token =?1")
    TokenEntity findOneToken(String token);

    @Query("from TokenEntity t where t.userId =?1 order by t.activeTime DESC")
    List<TokenEntity> findOneByUserId(Integer userId);
}
