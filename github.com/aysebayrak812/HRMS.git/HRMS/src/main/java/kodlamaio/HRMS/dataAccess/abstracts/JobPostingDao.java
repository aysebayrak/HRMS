package kodlamaio.HRMS.dataAccess.abstracts;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.JobPosting;

public interface JobPostingDao  extends JpaRepository<JobPosting,  Integer>{
//	List<JobPosting> findByActiveTrueEmployer_Id(int id);
//	List<JobPosting> findByActive(boolean isActive);
	

}
