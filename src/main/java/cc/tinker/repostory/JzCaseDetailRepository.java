package cc.tinker.repostory;

import com.gosuncn.core.repository.BaseRepository;
import cc.tinker.entity.JzCaseDetail;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface JzCaseDetailRepository extends BaseRepository<JzCaseDetail,String>{

	@Modifying
	@Query(value="update jz_case_detail set HANDLE_STATUS = 1 where AJBH = ?1",nativeQuery=true)
	void setIsImported(String ajbh);
	
	@Query(value="select * from jz_case_detail where AJBH = ?1 limit 1",nativeQuery=true)
	JzCaseDetail findOneCase(String ajbh);
	
	@Modifying
	@Query(value="update jz_case_detail set HANDLE_STATUS = 0 where AJBH = ?1",nativeQuery=true)
	void setIsNotImported(String ajbh);
}