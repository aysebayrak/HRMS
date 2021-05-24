package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.HRMS.business.abstracts.JobTitleService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobTitleDao;
import kodlamaio.HRMS.entities.concretes.JobTitle;
@Service
public class JobTitleManager implements JobTitleService {
	
	@Autowired
	private JobTitleDao  jobTitleDao;
	
	public  JobTitleManager() {}	
	

	@Override
	public DataResult<List<JobTitle>> getAll() {
		
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"Data listelendi");
	}

	@Override
	public DataResult<JobTitle> getByTitle(String title) {
		 return new SuccessDataResult<JobTitle>(this.jobTitleDao.findByTitle(title)) ;
	}

	@Override
	public Result add(JobTitle jobTitle) {
		
		return null;
	}
	
	
	 

}
