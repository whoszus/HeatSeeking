package cc.tinker.repository;

import cc.tinker.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;

/**
 * Created by Tinker on 2016/12/16.
 */
public interface TokenDao extends PagingAndSortingRepository<TokenEntity, Integer>,
        JpaSpecificationExecutor<TokenEntity> {

    @Query("from TokenEntity t where t.token =?1 and t.activeTime >= ?2 ")
    TokenEntity findOneByToken(String token, Date activeTime);
}
