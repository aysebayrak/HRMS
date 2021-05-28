package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.EmployerService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.ErrorResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HRMS.entities.concretes.Employer;


@Service
public class EmployerManager  implements EmployerService{
	
	private EmployerDao employerDao;
	
	public EmployerManager(EmployerDao  employerDao ) {
		super();
		this.employerDao=employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public DataResult<Employer> getByEmail(String email) {
		return new SuccessDataResult<>(this.employerDao.findByEmail(email));
		
	}

	@Override
	public Result add(Employer employer) {
		if(getByEmail(employer.getEmail()).getData()!=null) {
			return new ErrorResult("email var ");
		}
		this.employerDao.save(employer);
		return new SuccessResult("İŞ VEREN EKLENDİ");
	}

}
