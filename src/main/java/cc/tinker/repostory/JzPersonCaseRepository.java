package cc.tinker.repostory;

import com.gosuncn.core.repository.BaseRepository;
import cc.tinker.entity.JzPersonCaseEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Tinker on 2017/3/14.
 */
public interface JzPersonCaseRepository extends BaseRepository<JzPersonCaseEntity,String> {

    @Query("select c.rybh from JzCaseCriminalEntity c where c.xm =?1 group by c.zjhm")
    List<String> getCriminalListByName(String name);




}
