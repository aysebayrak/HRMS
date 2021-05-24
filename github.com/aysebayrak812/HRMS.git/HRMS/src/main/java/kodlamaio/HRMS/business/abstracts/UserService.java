package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.entities.User;
import kodlamaio.HRMS.core.utilities.result.DataResult;

public interface UserService {
	DataResult<List<User>> getAll();

}
