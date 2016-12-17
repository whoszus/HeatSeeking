package cc.tinker.repository;

import cc.tinker.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Tinker on 2016/12/16.
 */
public interface TokenDao extends PagingAndSortingRepository<TokenEntity, Integer>,
        JpaSpecificationExecutor<TokenEntity> {
}
