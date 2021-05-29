package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HRMS.business.abstracts.EmployerService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Employer;


@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result Add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
		
	}
	


}
