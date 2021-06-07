package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CandidateLanguageService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateLanguageDao;
import kodlamaio.HRMS.entities.concretes.CandidateLanguage;


@Service
public class CandidateLanguageManager  implements CandidateLanguageService  {
	
	private CandidateLanguageDao   candidateLanguageDao;
   
    @Autowired
	public CandidateLanguageManager(CandidateLanguageDao candidateLanguageDao) {
		super();
		this.candidateLanguageDao = candidateLanguageDao;
	}

	@Override
	public Result add(CandidateLanguage candidateLanguage) {
		this.candidateLanguageDao.save(candidateLanguage);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<CandidateLanguage>> getAllByCandidateId(int candidateId) {
		return new SuccessDataResult<List<CandidateLanguage>>(this.candidateLanguageDao.getAllByCandidateId(candidateId));
	}

	@Override
	public Result addAll(List<CandidateLanguage> candidateLanguage) {
		candidateLanguageDao.saveAll(candidateLanguage);
		return new SuccessResult();
		
	}

	@Override
	public DataResult<List<CandidateLanguage>> getAll() {
		return new SuccessDataResult<List<CandidateLanguage>>(this.candidateLanguageDao.findAll());
	}

}
