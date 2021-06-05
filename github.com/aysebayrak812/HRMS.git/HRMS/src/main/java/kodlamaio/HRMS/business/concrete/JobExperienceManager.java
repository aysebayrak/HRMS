package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobExperienceService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.HRMS.entities.concretes.JobExperience;


@Service
public class JobExperienceManager  implements JobExperienceService{
	
	private JobExperienceDao  jobExperienceDao;
	
	

	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		jobExperienceDao.save(jobExperience);
		return new SuccessResult("Başarı ile Eklendi");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(jobExperienceDao.findAll(),"Başarı ile listelendi");
	}
	
	

}
