package kodlamaio.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HRMS.business.abstracts.jopTitleService;
import kodlamaio.HRMS.entities.concretes.jobTitle;


@RestController
@RequestMapping("/api/jobtitles/")
public class jobTitlesController {
	

	private jopTitleService joptitleService;
	
	
	@Autowired
	public jobTitlesController(jopTitleService joptitleService) {
		super();
		this.joptitleService = joptitleService;
	}
	
	@GetMapping("/getall")
	public List<jobTitle> getAll(){
		return joptitleService.getAll();
	}
	

}
