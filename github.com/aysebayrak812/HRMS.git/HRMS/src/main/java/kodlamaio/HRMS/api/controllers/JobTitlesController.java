package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobTitleService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.JobTitle;


@RestController
@RequestMapping("/api/titles")
public class JobTitlesController {
	

	private JobTitleService jobTitleService;
	
	
	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>>  getAll(){
		return this.jobTitleService.getAll();
		
	}
	@PostMapping("/add")
	public Result Add(@RequestBody  JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
	

}
