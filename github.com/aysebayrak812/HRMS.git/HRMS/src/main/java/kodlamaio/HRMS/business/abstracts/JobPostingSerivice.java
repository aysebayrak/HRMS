package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.JobPosting;
import kodlamaio.HRMS.entities.dtos.JobPostingDto;

public interface JobPostingSerivice {
	DataResult<List<JobPosting>> getAll();
	
//	Result add(JobPostingDto jobPostDto);
	Result add(JobPosting jobPosting);

}
