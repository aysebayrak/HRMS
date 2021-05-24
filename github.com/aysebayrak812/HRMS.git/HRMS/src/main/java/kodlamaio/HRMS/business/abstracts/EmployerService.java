package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Employer;
import java.util.List;
public interface EmployerService {
	DataResult<List<Employer>> getAll();
	DataResult<Employer> getByEmail(String email);
	Result add(Employer employer);

}
