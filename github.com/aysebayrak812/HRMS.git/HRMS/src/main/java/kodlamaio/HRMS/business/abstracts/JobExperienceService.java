package kodlamaio.HRMS.business.abstracts;


import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.JobExperience;


public interface JobExperienceService {
	
	Result add(JobExperience jobExperience);
	DataResult<List<JobExperience>> getAll();

}
