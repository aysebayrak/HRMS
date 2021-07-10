package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.domain.Pageable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlamaio.HRMS.entities.concretes.JobPosting;
import kodlamaio.HRMS.entities.dtos.JobPostingFilterDto;

public interface JobPostingDao  extends JpaRepository<JobPosting,  Integer>{
//	List<JobPosting> findByActiveTrueEmployer_Id(int id);
//	List<JobPosting> findByActive(boolean isActive);
	
	
	@Modifying
	@Transactional  //Transaction işlemi bir veya birden fazla sorguların(SQL) aynı süreçte işlem görmesidir.
	@Query("update JobPosting set status=:status where id=:id")
	int updateStatus(@Param("status") int status ,@Param("id") int id);
	
	
	
	@Query("Select j from kodlamaio.HRMS.entities.concretes.JobPosting j where ((:#{filter.cityId}) IS NULL OR j.cityId IN (:#{#filter.cityId}))"
			+"and ((:#{#filter.jobTitleId}) IS NULL OR j.jobTitle.id IN (:#{#filter.jobTitleId}))"
			+" and ((:#{#filter.workPlaceId}) IS NULL OR j.workPlace.id IN (:#{#filter.workPlaceId}))"
			 +" and ((:#{#filter.workTimeId}) IS NULL OR j.workTime.id IN (:#{#filter.workTimeId}))"
			+"and j.status=1"
			)
	public Page<JobPosting> getByFilter(@Param("filter") JobPostingFilterDto jobPostingFilterDto ,Pageable pageable );

	
	List<JobPosting> getByStatus(int status);
	List<JobPosting> getByStatusAndEmployerId(int status, int id);
	
	JobPosting getById(int id);

}
