package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.JobPosting;
import kodlamaio.HRMS.entities.dtos.JobPostingFilterDto;


public interface JobPostingSerivice {
	DataResult<List<JobPosting>> getAll();
	
//	Result add(JobPostingDto jobPostDto);
	Result add(JobPosting jobPosting);
	
	//DataResult<JobPosting> getActiveAndCompanyId(int id);
//	DataResult<List<JobPosting>> getActiveJobPosting();
	
	
   Result updateStatus(int status,int id);
   DataResult<List<JobPosting>> getByStatus(int status);
   DataResult<List<JobPosting>> getByStatusAndEmployerId(int status, int employerId);
   Result update(JobPosting jobPosting);
   DataResult<JobPosting> getById(int id);
   DataResult<List<JobPosting>> getAllSorted(); //oluşturulma tarihine göre
   Result delete(int jobPostingId);


	DataResult<List<JobPosting>> getByPage(int pageNo,int pageSize);
   
   
   DataResult<List<JobPosting>> getByAndFilter(int pageNo, int pageSize, JobPostingFilterDto jobPostingFilter);
}
