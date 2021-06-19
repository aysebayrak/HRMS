package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.WorkTime;

public interface WorkTimeDao  extends JpaRepository<WorkTime, Integer>{

	WorkTime getById(int workTimeId);

}
