package kodlamaio.HRMS.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CandidateLanguageService;
import kodlamaio.HRMS.entities.concretes.CandidateLanguage;

@RestController
@RequestMapping("/api/candidatelanguages")
public class CandidateLanguagesController {
	

    private  CandidateLanguageService candidateLanguageService;

    @Autowired
    public CandidateLanguagesController(CandidateLanguageService candidateLanguageService) {
        this.candidateLanguageService = candidateLanguageService;
    }
    

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid CandidateLanguage candidateLanguage){
        return ResponseEntity.ok(this.candidateLanguageService.add(candidateLanguage));
    }
    
    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateLanguageService.getAll());
    }
    
    
}
