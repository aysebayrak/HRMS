package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.City;

public interface CityDao  extends JpaRepository<City, Integer>{

	City getById(int cityId);

}
