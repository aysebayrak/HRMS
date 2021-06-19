package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.WorkPlace;

public interface WorkPlaceDao  extends JpaRepository<WorkPlace, Integer> {

	WorkPlace getById(int workPlaceId);

}
