package cc.tinker.web.repository;

import cc.tinker.web.entity.RedswordRsaKeyEntity;
import org.springframework.data.jpa.repository.Query;
import cc.tinker.entry.repository.BaseRepository;

/**
 * Created by whoszus on 2017/4/11.
 *
 * @email whoszus@yahoo.com
 */
public interface RedSwordRsaKeyRepository extends BaseRepository<RedswordRsaKeyEntity,Integer> {

    @Query("from RedswordRsaKeyEntity r where r.keyHolder = ?1")
    RedswordRsaKeyEntity findOneByUserId(Integer userId);


}
