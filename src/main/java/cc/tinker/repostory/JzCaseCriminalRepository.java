package cc.tinker.repostory;

import cc.tinker.entity.JzCaseCriminalEntity;
import org.springframework.data.jpa.repository.Query;
import tinker.entr.repository.BaseRepository;

import java.util.List;

/**
 * Created by Tinker on 2017/3/14.
 */
public interface JzCaseCriminalRepository extends BaseRepository<JzCaseCriminalEntity,String> {

//    @Query("select c.rybh from JzCaseCriminalEntity c where c.xm =?1 group by c.zjhm")
//    List<String> getCriminalListByName(String name);


    @Query("select c.reservation50 from JzCaseCriminalEntity c where c.xm=?1 group by c.zjhm")
    List<String> getCaseNumByName(String name);
}
