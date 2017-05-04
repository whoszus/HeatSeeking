package cc.tinker.service;

import cc.tinker.entity.*;
import cc.tinker.repostory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public void saveCaseInfoList(Iterable<JzCaseInfoEntity> entities) {
        jzCaseInfoEntityRepository.save(entities);
    }

    public void saveCaseDetailList(Iterable<JzCaseDetailEntity> entities) {
        jzCaseDetailEntityRepository.save(entities);
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
