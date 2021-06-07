package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CandidateLinkService;
import kodlamaio.HRMS.entities.concretes.CandidateLink;

@RestController
@RequestMapping("/api/candidatelinks")
public class CandidateLinksController {
	
    private  CandidateLinkService candidateLinkService;

    @Autowired
    public CandidateLinksController(CandidateLinkService candidateLinkService) {
        this.candidateLinkService = candidateLinkService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody CandidateLink candidateLink){
        return ResponseEntity.ok(this.candidateLinkService.add(candidateLink));
    }


    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateLinkService.getAll());
    }

}
