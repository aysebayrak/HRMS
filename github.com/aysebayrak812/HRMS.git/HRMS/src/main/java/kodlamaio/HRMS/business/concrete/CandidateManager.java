package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CandidateEducationService;
import kodlamaio.HRMS.business.abstracts.CandidateExperienceService;
import kodlamaio.HRMS.business.abstracts.CandidateImageService;
import kodlamaio.HRMS.business.abstracts.CandidateLanguageService;
import kodlamaio.HRMS.business.abstracts.CandidateLinkService;
import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.business.abstracts.CandidateSkillService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.ErrorResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateDao;
import kodlamaio.HRMS.entities.concretes.Candidate;
import kodlamaio.HRMS.entities.dtos.CVDto;


@Service
public class CandidateManager implements CandidateService {
	
private CandidateDao candidateDao;
private CandidateEducationService candidateEducationService;
private  CandidateExperienceService candidateExperienceService;
private  CandidateImageService candidateImageService;
private CandidateLanguageService candidateLanguageService;
private CandidateLinkService candidateLinkService;
private CandidateSkillService candidateSkillService;


	

	

	public CandidateManager(CandidateDao candidateDao, CandidateEducationService candidateEducationService,
		CandidateExperienceService candidateExperienceService, CandidateImageService candidateImageService,
		CandidateLanguageService candidateLanguageService, CandidateLinkService candidateLinkService,
		CandidateSkillService candidateSkillService) {
	super();
	this.candidateDao = candidateDao;
	this.candidateEducationService = candidateEducationService;
	this.candidateExperienceService = candidateExperienceService;
	this.candidateImageService = candidateImageService;
	this.candidateLanguageService = candidateLanguageService;
	this.candidateLinkService = candidateLinkService;
	this.candidateSkillService = candidateSkillService;
}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"DATA LİSTELENDİ");
	}

	@Override
	public DataResult<Candidate> getByNationalIdentity(String nationalIdentity) {
		return new SuccessDataResult<>(this.candidateDao.findByNationalIdentity(nationalIdentity));
	}

	@Override
	public DataResult<Candidate> getByEmail(String email) {
	       return new SuccessDataResult<>(this.candidateDao.findByEmail(email));
	}

	@Override
	public Result add(Candidate candidate) {
		if(getByNationalIdentity(candidate.getNationalIdentity()).getData()!= null) {
			return new ErrorResult("Bu kimlik zaten var ");
		}
		else if(getByEmail(candidate.getEmail()).getData()!=null) {
			return new ErrorResult("BU MAİL VAR");
		}
		this.candidateDao.save(candidate);
		return new SuccessResult("iş arayan eklendi");
	}


	@Override
	public DataResult<Candidate> getById(int id) {
	return new SuccessDataResult<>(this.candidateDao.findById(id).get());
		
	}


	@Override
	public DataResult<CVDto> getResumeByCandidateId(int candidateId) {
		CVDto cvDto= new CVDto();
		cvDto.setCanidate(this.getById(candidateId).getData());
		cvDto.setCandidateEducations(this.candidateEducationService.getAllByCandidateIdOrderByGraduationYear(candidateId).getData());
		cvDto.setCandidateExperiences(this.candidateExperienceService.getAllByCandidateIdOrderByLeaveDate(candidateId).getData());
		cvDto.setCandidateImages(this.candidateImageService.getAllByCandidateId(candidateId).getData());
		cvDto.setCandidateLanguages(this.candidateLanguageService.getAllByCandidateId(candidateId).getData());
		cvDto.setCandidateSkills(this.candidateSkillService.getAllByCandidateId(candidateId).getData());
		cvDto.setCandidateLinks(this.candidateLinkService.getAllByCandidateId(candidateId).getData());
		return new SuccessDataResult<>(cvDto);
	}

	@Override
	public Result update(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Aday Güncellendi");
	}

}
