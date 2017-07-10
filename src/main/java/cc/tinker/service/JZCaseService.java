package cc.tinker.service;

import cc.tinker.entity.*;
import cc.tinker.repostory.*;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Tinker on 2017/3/14.
 */
@Service
@Transactional
public class JZCaseService {

    @Autowired
    JzCaseDetailEntityRepository jzCaseDetailEntityRepository;
    @Autowired
    JzCaseInfoEntityRepository jzCaseInfoEntityRepository;
    @Autowired
    JzDictionaryRepository jzDictionaryRepository;
    @Autowired
    JzCaseCriminalRepository jzCaseCriminalRepository;
    @Autowired
    JzCasePersonRepository jzCasePersonRepository;
    @Autowired
    JzPersonCaseRepository jzPersonCaseRepository;

    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(JZCaseService.class);



    public void saveCaseInfoList(Iterable<JzCaseInfoEntity> entities) {
        jzCaseInfoEntityRepository.save(entities);
    }

    public void saveCaseDetailList(Iterable<JzCaseDetailEntity> entities) {
        int count  = 0 ;
        List<JzCaseDetailEntity> jzCaseDetailEntityList  = new ArrayList<>();
        for(JzCaseDetailEntity entity: entities){
            if(!listContains(jzCaseDetailEntityList,entity)){
                jzCaseDetailEntityList.add(entity);
            }else{
                count++;
            }
        }
        logger.info("本次同步出现重复案件编号,重复次数 + "+count);
        Iterable<JzCaseDetailEntity> jzCaseDetailEntityIterable =  jzCaseDetailEntityRepository.save(jzCaseDetailEntityList);
        for (JzCaseDetailEntity entity : jzCaseDetailEntityIterable) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(entity.getAjbh());
            stringBuffer.append(",");
        }
    }

    /**
     * 判断列表中是否已有此案件存在；
     * @param entities
     * @param jzCaseDetailEntity
     * @return
     */
    private boolean listContains(Iterable<JzCaseDetailEntity> entities,JzCaseDetailEntity jzCaseDetailEntity){
        for(JzCaseDetailEntity entity :entities){
            if(entity.getAjbh().equals(jzCaseDetailEntity.getAjbh())){
                return true;
            }
        }
        return false;
    }

    public void saveDictionaryList(Iterable<JzDictionaryEntity> entities) {
        jzDictionaryRepository.save(entities);
    }

    public void saveCaseCriminalList(Iterable<JzCaseCriminalEntity> entities) {
        jzCaseCriminalRepository.save(entities);
    }

    public void saveCasePersonList(Iterable<JzCasePersonEntity> entities) {
        jzCasePersonRepository.save(entities);
    }

    public void savePersonCaseList(Iterable<JzPersonCaseEntity> entities) {
        jzPersonCaseRepository.save(entities);
    }


}
