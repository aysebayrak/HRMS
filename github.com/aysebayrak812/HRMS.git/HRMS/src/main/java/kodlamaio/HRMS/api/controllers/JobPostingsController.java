package kodlamaio.HRMS.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobPostingSerivice;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/jobpostings")
public class JobPostingsController {
	
	private JobPostingSerivice  jobPostingService;

	
	@Autowired
	public JobPostingsController(JobPostingSerivice  jobPostingService) {
		super();
		this.jobPostingService =jobPostingService;
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosting>> getAll(){
		return this.jobPostingService.getAll();		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting  jobPosting) {
		return this.jobPostingService.add(jobPosting);
		
		
	}
	
	

}
