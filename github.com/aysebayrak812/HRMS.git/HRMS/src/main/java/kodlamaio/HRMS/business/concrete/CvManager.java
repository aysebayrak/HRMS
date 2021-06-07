package kodlamaio.HRMS.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CandidateEducationService;
import kodlamaio.HRMS.business.abstracts.CandidateExperienceService;
import kodlamaio.HRMS.business.abstracts.CandidateImageService;
import kodlamaio.HRMS.business.abstracts.CandidateLanguageService;
import kodlamaio.HRMS.business.abstracts.CandidateLinkService;
import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.business.abstracts.CandidateSkillService;
import kodlamaio.HRMS.business.abstracts.CvService;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.entities.concretes.Candidate;
import kodlamaio.HRMS.entities.dtos.CVDto;


@Service
public class CvManager  implements CvService{
	
	private CandidateService candidateService;
    private CandidateEducationService candidateEducationService;
    private CandidateExperienceService candidateExperienceService;
    private  CandidateImageService candidateImageService;
    private  CandidateLanguageService candidateLanguageService;
    private  CandidateLinkService candidateLinkService;
    private  CandidateSkillService candidateSkillService;
	
	
	
   @Autowired
	public CvManager(CandidateService candidateService, CandidateEducationService candidateEducationService,
			CandidateExperienceService candidateExperienceService, CandidateImageService candidateImageService,
			CandidateLanguageService candidateLanguageService, CandidateLinkService candidateLinkService,
			CandidateSkillService candidateSkillService) {
		super();
		this.candidateService = candidateService;
		this.candidateEducationService = candidateEducationService;
		this.candidateExperienceService = candidateExperienceService;
		this.candidateImageService = candidateImageService;
		this.candidateLanguageService = candidateLanguageService;
		this.candidateLinkService = candidateLinkService;
		this.candidateSkillService = candidateSkillService;
	}




	@Override
	public Result add(CVDto cvDto, int candidateId) {
		Candidate candidate = candidateService.getById(candidateId).getData();
		cvDto.setCanidate(candidate);
		
		
		
		cvDto.getCandidateEducations().forEach(candidateEducation -> candidateEducation.setCandidate(candidate));
		candidateEducationService.addAll(cvDto.getCandidateEducations());
		
	    cvDto.getCandidateExperiences().forEach(candidateExperience -> candidateExperience.setCandidate(candidate));
	    candidateExperienceService.addAll(cvDto.getCandidateExperiences());
		
        cvDto.getCandidateImages().forEach(candidateImage -> candidateImage.setCandidate(candidate));
        candidateImageService.addAll(cvDto.getCandidateImages());
        
        cvDto.getCandidateLanguages().forEach(candidateLanguage -> candidateLanguage.setCandidate(candidate));
        candidateLanguageService.addAll(cvDto.getCandidateLanguages());
        
        cvDto.getCandidateLinks().forEach(candidateLink -> candidateLink.setCandidate(candidate));
        candidateLinkService.addAll(cvDto.getCandidateLinks());
        
        cvDto.getCandidateSkills().forEach(candidateSkill -> candidateSkill.setCandidate(candidate));
        candidateSkillService.addAll(cvDto.getCandidateSkills());
        

        return new SuccessResult("Cv eklendi");
		
		
	}

}
