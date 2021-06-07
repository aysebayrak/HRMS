package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CandidateEducationService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateEducationDao;
import kodlamaio.HRMS.entities.concretes.CandidateEducation;



@Service
public class CandidateEducationManager  implements CandidateEducationService{
	
	private CandidateEducationDao candidateEducationDao;

	public CandidateEducationManager(CandidateEducationDao candidateEducationDao) {
		super();
		this.candidateEducationDao = candidateEducationDao;
	}

	@Override
	public Result add(CandidateEducation candidateEducation) {
		this.candidateEducationDao.save(candidateEducation);
		return new SuccessResult();
	}

	@Override
	public Result addAll(List<CandidateEducation> candidateEducation) {
	     candidateEducationDao.saveAll(candidateEducation);
	     return new SuccessResult();
	     
	}

	@Override
	public DataResult<List<CandidateEducation>> getAll() {
		return new SuccessDataResult<List<CandidateEducation>>(this.candidateEducationDao.findAll());
	}

	@Override
	public DataResult<List<CandidateEducation>> getAllByCandidateIdOrderByGraduationYear(int candidateId) {
		return new SuccessDataResult<List<CandidateEducation>>(this.candidateEducationDao.getAllByCandidateIdOrderByGraduationYear(candidateId),"Data listelendi");
	}

}
