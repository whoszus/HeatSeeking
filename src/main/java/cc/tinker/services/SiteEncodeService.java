package cc.tinker.services;

import cc.tinker.entity.SiteEncodePasswordEntity;
import cc.tinker.repository.SiteEncodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tinker.entr.repository.SearchFilter;

import java.util.Map;


/**
 * Created by whoszus on 2017/4/10.
 *
 * @email whoszus@yahoo.com
 */
@Service
@Transactional
public class SiteEncodeService {
    @Autowired
    SiteEncodeRepository siteEncodeRepository;

    public Page<SiteEncodePasswordEntity>
    getSiteBootstrapTable(Map<String, Object> searchParams, int pageNumber, int pageSize, String sortType) {
        PageRequest pageRequest = SearchFilter.buildPageRequest(pageNumber, pageSize, sortType, "id");
//        Specification<SiteEncodePasswordEntity> spec = SearchFilter.buildSpecification(searchParams, SiteEncodePasswordEntity.class);

        return null;


    }

}
