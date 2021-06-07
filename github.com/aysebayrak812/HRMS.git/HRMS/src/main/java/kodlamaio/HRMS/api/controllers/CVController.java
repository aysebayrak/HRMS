package kodlamaio.HRMS.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CvService;
import kodlamaio.HRMS.entities.dtos.CVDto;

@RestController
@RequestMapping("/api/cv")
public class CVController {
	
	 private CvService cvService;

	    @Autowired
	    public CVController(CvService cvService) {
	        this.cvService = cvService;
	    }

	    @PostMapping("/add")
	    public ResponseEntity<?> add(@RequestBody @Valid CVDto cvDto, int candidateId) {
	        return ResponseEntity.ok(cvService.add(cvDto,candidateId));
	    }

}
