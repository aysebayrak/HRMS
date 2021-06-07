package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CandidateExperienceService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateExperienceDao;
import kodlamaio.HRMS.entities.concretes.CandidateExperience;


@Service 
public class CandidateExperienceManager implements  CandidateExperienceService {  //deneyim
	
	private CandidateExperienceDao candidateExperienceDao;

	@Autowired
	public CandidateExperienceManager(CandidateExperienceDao candidateExperienceDao) {
		super();
		this.candidateExperienceDao = candidateExperienceDao;
	}

	
	@Override
	public Result add(CandidateExperience candidateExperience) {
		this.candidateExperienceDao.save(candidateExperience);
		 return new SuccessResult();
		
	}

	@Override
	public Result addAll(List<CandidateExperience> candidateExperience) {
		candidateExperienceDao.saveAll(candidateExperience);
		return new SuccessResult();
		
	}

	@Override
	public DataResult<List<CandidateExperience>> getAll() {
		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.findAll());
	}

	@Override
	public DataResult<List<CandidateExperience>> getAllByCandidateIdOrderByLeaveDate(int candidateId) {
		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.getAllByCandidateIdOrderByLeaveDateDesc(candidateId));
	}

}
