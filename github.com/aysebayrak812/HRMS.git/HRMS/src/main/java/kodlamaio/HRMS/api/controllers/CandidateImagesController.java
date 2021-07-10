package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.business.abstracts.CandidateImageService;
import kodlamaio.HRMS.entities.concretes.Candidate;
import kodlamaio.HRMS.entities.concretes.CandidateImage;

@RestController
@RequestMapping("/api/candidateimages")
public class CandidateImagesController {
	
	  private  CandidateImageService candidateImageService;

	    @Autowired
	    public CandidateImagesController(CandidateImageService candidateImageService) {
	        this.candidateImageService = candidateImageService;
	    }
	    
	    

	    @PostMapping(value = "/add")
	    public ResponseEntity<?> add(@RequestBody MultipartFile file,@RequestParam int candidateId) {
	        CandidateImage candidateImage = new CandidateImage();
	        Candidate candidate = new Candidate();
	        candidate.setId(candidateId);
	        candidateImage.setCandidate(candidate);
	        return ResponseEntity.ok(this.candidateImageService.add(candidateImage,file));
	    }
	    

	    @GetMapping("/getall")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(this.candidateImageService.getAll());
	    }

	    
	    
	    @GetMapping("/getByCandidateId")
	    public ResponseEntity<?> getByCandidateId(int candidateId){
	    	return ResponseEntity.ok(this.candidateImageService.getAllByCandidateId(candidateId));
	    }
	    

}
