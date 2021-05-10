package kodlamaio.HRMS.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HRMS.business.abstracts.jopTitleService;
import kodlamaio.HRMS.entities.concretes.jobTitle;


@RestController
@RequestMapping("api/job-titles/")
public class jobTitlesController {
	

	private final jopTitleService joptitleService;
	
	public jobTitlesController(jopTitleService joptitleService) {
		super();
		this.joptitleService = joptitleService;
	}
	
	@GetMapping
	public List<jobTitle> getAll(){
		return joptitleService.getAll();
	}
	

}
