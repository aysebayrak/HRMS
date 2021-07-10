package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Candidate;


@RestController
@RequestMapping("/api/candidates")
@CrossOrigin
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
	
	
	@PostMapping("/add")
	public Result Add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}

	@GetMapping("/getResumeByCandidateId")
	public ResponseEntity<?> getResumeByCandidateId(@RequestParam int candidateId){
		return ResponseEntity.ok(this.candidateService.getResumeByCandidateId(candidateId));
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody Candidate candidate){
		return ResponseEntity.ok(this.candidateService.update(candidate));
	}
	
	
	@GetMapping("/getById")
	public ResponseEntity<?> getById(@RequestParam int id){
		return ResponseEntity.ok(this.candidateService.getById(id));
	}
	
}
