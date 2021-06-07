package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CandidateExperienceService;
import kodlamaio.HRMS.entities.concretes.CandidateExperience;

@RestController
@RequestMapping("/api/candidateexperiences")
public class CandidateExperiencesController {
	  private CandidateExperienceService candidateExperienceService;
	  
	  @Autowired
	    public CandidateExperiencesController(CandidateExperienceService candidateExperienceService) {
	        this.candidateExperienceService = candidateExperienceService;
	    }
	  
	  
	  @PostMapping("/add")
	  // public ResponseEntity<?> add(@RequestBody @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) CandidateExperience candidateExperience){
	  public ResponseEntity<?> add (@RequestBody  CandidateExperience candidateExperience){
	        return ResponseEntity.ok(this.candidateExperienceService.add(candidateExperience));
	    }


	    @GetMapping("/getall")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(this.candidateExperienceService.getAll());
	    }
	    
	    @GetMapping("/getallbycandidateidorderbyleavedate")
	    public ResponseEntity<?> getAllOrderByLeaveDate(@RequestParam int candidateId){
	        return ResponseEntity.ok(this.candidateExperienceService.getAllByCandidateIdOrderByLeaveDate(candidateId));
	    }

}
