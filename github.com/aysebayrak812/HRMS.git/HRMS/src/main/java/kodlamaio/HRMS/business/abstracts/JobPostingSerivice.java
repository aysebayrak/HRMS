package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.JobPosting;


public interface JobPostingSerivice {
	DataResult<List<JobPosting>> getAll();
	
//	Result add(JobPostingDto jobPostDto);
	Result add(JobPosting jobPosting);
	
	//DataResult<JobPosting> getActiveAndCompanyId(int id);
//	DataResult<List<JobPosting>> getActiveJobPosting();
	
	
   Result updateStatus(int status,int id);
}
