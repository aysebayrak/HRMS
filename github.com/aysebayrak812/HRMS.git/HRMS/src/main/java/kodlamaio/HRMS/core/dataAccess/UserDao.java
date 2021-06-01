package kodlamaio.HRMS.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.core.entities.User;

public interface UserDao  extends JpaRepository<User, Integer>{

}
