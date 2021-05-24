package kodlamaio.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Candidate;


@RestController
@RequestMapping("7api/candidates")
public class CandidatesController {
	
	private CandidateService  candidateService;
	
	@Autowired
	public CandidatesController (CandidateService candidateService) {
		super();
		this.candidateService=candidateService;
		
		
	}
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
		
	}
	
	public Result Add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}

}
