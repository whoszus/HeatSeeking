package cc.tinker.repository;

import cc.tinker.entity.RedswordRsaKeyEntity;
import org.springframework.data.jpa.repository.Query;
import tinker.entr.repository.BaseRepository;

/**
 * Created by whoszus on 2017/4/11.
 *
 * @email whoszus@yahoo.com
 */
public interface RedSwordRsaKeyRepository extends BaseRepository<RedswordRsaKeyEntity,Integer> {

    @Query("from RedswordRsaKeyEntity r where r.keyHolder = ?1")
    RedswordRsaKeyEntity findOneByUserId(Integer userId);


}
