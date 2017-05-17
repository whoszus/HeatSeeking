package cc.tinker.web.repository;

import cc.tinker.web.entity.AuthenticationEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Tinker on 2016/12/16.
 */
public interface AuthenticationDao extends PagingAndSortingRepository<AuthenticationEntity, Integer>,
        JpaSpecificationExecutor<AuthenticationEntity> {
    @Query("from AuthenticationEntity a where a.userName=?1 or a.userAccount =?1 or a.userEmail=?1 and a.userPassword =?2")
    AuthenticationEntity authByNameAndPsw(String clientName,String pwd);

    @Query("from AuthenticationEntity a where a.userName = ?1 and a.userEmail = ?2")
    AuthenticationEntity userCheck(String userName,String email);
}
