package cc.tinker.repostory;

import cc.tinker.entity.JzCaseDetailEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Tinker on 2017/3/14.
 */
public interface JzCaseDetailEntityRepository extends PagingAndSortingRepository<JzCaseDetailEntity, Integer>,
        JpaSpecificationExecutor<JzCaseDetailEntity> {

}
