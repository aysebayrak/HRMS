package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.WorkPlaceService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.entities.concretes.WorkPlace;

import java.util.List;


@RestController
@RequestMapping("/workplace")
@CrossOrigin
public class WorkPlacesController {
	
	
	private WorkPlaceService workPlaceService;

	
	@Autowired
	public WorkPlacesController(WorkPlaceService workPlaceService) {
		super();
		this.workPlaceService = workPlaceService;
	}

	
	
   @GetMapping("/getall")
	public DataResult<List<WorkPlace>>  getAlll(){
		return this.workPlaceService.getAll();
		
	}
}
