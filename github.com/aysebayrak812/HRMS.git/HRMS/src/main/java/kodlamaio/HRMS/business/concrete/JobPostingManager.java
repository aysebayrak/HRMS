package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobPostingSerivice;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobPostingDao;
import kodlamaio.HRMS.entities.concretes.JobPosting;


@Service
public class JobPostingManager  implements JobPostingSerivice{
	
	private JobPostingDao jobPostingDao;
	
	@Autowired
	 public JobPostingManager(JobPostingDao jobPostingDao) {
		 super();
		this.jobPostingDao=jobPostingDao;
	 }
	 

	@Override
	public DataResult<List<JobPosting>> getAll() {
	return new SuccessDataResult<List<JobPosting>>(jobPostingDao.findAll(),"Data Listeleni"); 
	}

	@Override
	public Result add(JobPosting jobPosting) {
		jobPostingDao.save(jobPosting);
		return new SuccessResult("eklendi");
	}

}
