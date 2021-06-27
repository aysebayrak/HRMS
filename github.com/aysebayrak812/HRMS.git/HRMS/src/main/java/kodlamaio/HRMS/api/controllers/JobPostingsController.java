package kodlamaio.HRMS.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobPostingSerivice;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.JobPosting;
import kodlamaio.HRMS.entities.dtos.JobPostingDto;

@RestController
@RequestMapping("/api/jobpostings")
@CrossOrigin
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
//	
//	@PostMapping("/add")
//	public ResponseEntity<?> add(@RequestBody JobPostingDto  jobPostDto) {
//	Result result=this.jobPostingService.add(jobPostDto);
//		if(result.isSuccess()) {
//		    return ResponseEntity.ok(result);
//		}
//		
//		   return ResponseEntity.badRequest().body(result);
//		
//		
//		
//	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}
	
	
//	@GetMapping("/getactiveposting")
//	public DataResult<List<JobPosting>> getActiveJobPosting(){
//		return this.jobPostingService.getActiveJobPosting();
//	}
	
	@PostMapping("/statusupdate")
	public Result updateStatus(@RequestParam("status") int status,@RequestParam("id")int id) {
		return this.jobPostingService.updateStatus(status, id);
	}

}
