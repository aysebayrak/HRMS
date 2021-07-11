package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CandidateSkillService;
import kodlamaio.HRMS.entities.concretes.CandidateSkill;

@RestController
@RequestMapping("/api/candidateskills")
public class CandidateSkillsController {
	
	
	 private CandidateSkillService candidateSkillService;

	    @Autowired
	    public CandidateSkillsController(CandidateSkillService candidateSkillService) {
	        this.candidateSkillService = candidateSkillService;
	    }

	    @PostMapping("/add")
	    public ResponseEntity<?> add(@RequestBody CandidateSkill candidateSkill){
	        return ResponseEntity.ok(this.candidateSkillService.add(candidateSkill));
	    }


	    @GetMapping("/getall")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(this.candidateSkillService.getAll());
	    }
	    

		@PutMapping("/update")
		public ResponseEntity<?> update(@RequestBody CandidateSkill candidateSkill){
			return ResponseEntity.ok(this.candidateSkillService.update(candidateSkill));
		}
		

		@GetMapping("/getAllByCandidateId")
		    public ResponseEntity<?> getAllByCandidateId(int candidateId){
		        return ResponseEntity.ok(this.candidateSkillService.getAllByCandidateId(candidateId));
		    }
		
		
	

}
