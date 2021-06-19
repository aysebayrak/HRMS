package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.WorkTimeService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.entities.concretes.WorkTime;

import java.util.List;

@RestController
@RequestMapping("/worktime")
@CrossOrigin
public class WorkTimesController {
	
	private WorkTimeService workTimeService;

	@Autowired
	public WorkTimesController(WorkTimeService workTimeService) {
		super();
		this.workTimeService = workTimeService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<WorkTime>>  getAll(){
		return this.workTimeService.getAll();
		
	}
	

}
