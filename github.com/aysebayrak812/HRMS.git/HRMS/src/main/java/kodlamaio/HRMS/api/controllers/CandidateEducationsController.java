package kodlamaio.HRMS.api.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CandidateEducationService;
import kodlamaio.HRMS.entities.concretes.CandidateEducation;

@RestController
@RequestMapping("/api/candidateeducations")
public class CandidateEducationsController {
	
	private CandidateEducationService candidateEducationService;

	@Autowired
	public CandidateEducationsController(CandidateEducationService candidateEducationService) {
		super();
		this.candidateEducationService = candidateEducationService;
	}
	


    @PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateEducation candidateEducation){
		return  ResponseEntity.ok(this.candidateEducationService.add(candidateEducation));
	}
    
    
    
    @GetMapping("/getall")
    public ResponseEntity<?>  getAll(){
    	return ResponseEntity.ok(this.candidateEducationService.getAll());
    }
    
    
 
    @GetMapping("/getallbycandidateidorderbygraduationyear")
    public ResponseEntity<?> getAllByCandidateIdOrderByGraduationYear(@RequestParam int candidateId){
        return ResponseEntity.ok(this.candidateEducationService.getAllByCandidateIdOrderByGraduationYear(candidateId));
    }
    
    
	@GetMapping("/getAllByCandidateId")
    public ResponseEntity<?> getAllByCandidateId(int candidateId){
    	return ResponseEntity.ok(this.candidateEducationService.getAllByCandidateId(candidateId));
    	
    }
	
	
	@PutMapping("/update")
	public ResponseEntity<?>  update(@RequestBody CandidateEducation candidateEducation){
		return ResponseEntity.ok(this.candidateEducationService.update(candidateEducation));
	}
    
    
	
	
}
