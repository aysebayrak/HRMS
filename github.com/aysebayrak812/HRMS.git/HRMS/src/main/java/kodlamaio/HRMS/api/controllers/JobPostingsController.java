package kodlamaio.HRMS.api.controllers;
import java.util.List;

import javax.validation.Valid;

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

	
	@PostMapping("/statusupdate")
	public Result updateStatus(@RequestParam("status") int status,@RequestParam("id")int id) {
		return this.jobPostingService.updateStatus(status, id);
	}

	
	@GetMapping("/getById")
	public ResponseEntity<?> getById(@RequestParam int id) {
		return ResponseEntity.ok(this.jobPostingService.getById(id));
				
	}
	

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobPosting jobPosting) {
		return ResponseEntity.ok(this.jobPostingService.add(jobPosting));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(int jobPostingId) {
		return ResponseEntity.ok(this.jobPostingService.delete( jobPostingId));
	}
	
	@GetMapping("/getAllSorted")
	public ResponseEntity<?> getAllSorted() {
		return ResponseEntity.ok(this.jobPostingService.getAllSorted());
	
  }
	
	@GetMapping("/getByStatusAndEmployerId")
	public ResponseEntity<?> getByStatusAndEmployerId(int status, int employerId){
		return ResponseEntity.ok(this.jobPostingService.getByStatusAndEmployerId(status, employerId));
	}

	@GetMapping("/getAllTrue")
	public DataResult<List<JobPosting>> getByStatus(int status) {
		return this.jobPostingService.getByStatus(status);
	}
	
	@GetMapping("/getByPage")
	public ResponseEntity<?> getByPage( @RequestParam int pageNo,@RequestParam int pageSize){
		return   ResponseEntity.ok(this.jobPostingService.getByPage(pageNo, pageSize));
	}
	
	
	
}
