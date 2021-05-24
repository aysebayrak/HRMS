package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.core.entities.User;

public interface UserDao  extends JpaRepository<User, Integer>{

}
