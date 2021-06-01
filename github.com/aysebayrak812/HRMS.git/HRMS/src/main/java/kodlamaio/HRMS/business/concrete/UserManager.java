package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.core.dataAccess.UserDao;
import kodlamaio.HRMS.core.entities.User;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;

@Service
public class UserManager  implements UserService{
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao=userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
	  return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data Listelendi");
		
	}

}
