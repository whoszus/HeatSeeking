package cc.tinker.repository;

import cc.tinker.entity.AuthenticationEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Tinker on 2016/12/16.
 */
public interface AuthenticationDao extends PagingAndSortingRepository<AuthenticationEntity, Integer>,
        JpaSpecificationExecutor<AuthenticationEntity> {

    @Query("from AuthenticationEntity a where a.clientName=?1 and a.password =?2")
    AuthenticationEntity authByNameAndPsw(String clientName,String pwd);

}
