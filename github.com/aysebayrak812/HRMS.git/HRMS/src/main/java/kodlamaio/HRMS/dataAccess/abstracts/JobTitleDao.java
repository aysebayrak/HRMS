package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.JobTitle;

public interface JobTitleDao  extends JpaRepository<JobTitle, Integer>{
	 JobTitle findByTitle(String title);
}
