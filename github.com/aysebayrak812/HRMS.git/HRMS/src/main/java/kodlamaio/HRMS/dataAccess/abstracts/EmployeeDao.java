package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Employee;

public interface EmployeeDao extends  JpaRepository<Employee, Integer> {
	Employee getById(int id);

}
