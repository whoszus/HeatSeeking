package cc.tinker.repostory;

import com.gosuncn.core.repository.BaseRepository;
import cc.tinker.entity.JzCasePersonEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Tinker on 2017/3/14.
 */
public interface JzCasePersonRepository extends BaseRepository<JzCasePersonEntity,String> {

    @Query("select c.reservation12 from JzCasePersonEntity c where c.xm=?1 group by c.zjhm")
    List<String> getCaseNumByName(String name);


}
