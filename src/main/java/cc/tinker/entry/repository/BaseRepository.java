package cc.tinker.entry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by whoszus on 2017/4/10.
 *
 * @email whoszus@yahoo.com
 */
@NoRepositoryBean
public interface BaseRepository<S,ID extends Serializable> extends JpaRepository<S,ID>,JpaSpecificationExecutor<S> {

}

