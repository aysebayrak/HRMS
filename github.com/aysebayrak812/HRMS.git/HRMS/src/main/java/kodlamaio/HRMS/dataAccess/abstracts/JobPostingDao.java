package kodlamaio.HRMS.dataAccess.abstracts;

import javax.transaction.Transactional;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.HRMS.entities.concretes.JobPosting;

public interface JobPostingDao  extends JpaRepository<JobPosting,  Integer>{
//	List<JobPosting> findByActiveTrueEmployer_Id(int id);
//	List<JobPosting> findByActive(boolean isActive);
	
	
	@Modifying
	@Transactional  //Transaction işlemi bir veya birden fazla sorguların(SQL) aynı süreçte işlem görmesidir.
	@Query("update JobPosting set status=:status where id=:id")
	int updateStatus(@Param("status") int status ,@Param("id") int id);
	

}
