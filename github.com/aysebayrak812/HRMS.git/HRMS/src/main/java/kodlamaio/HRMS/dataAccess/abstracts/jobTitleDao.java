package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.jobTitle;

public interface jobTitleDao  extends JpaRepository<jobTitle, Integer>{

}
