package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Education;

public interface EducationDao  extends JpaRepository<Education, Integer> {

}
