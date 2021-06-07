package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CandidateLinkService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateLinkDao;
import kodlamaio.HRMS.entities.concretes.CandidateLink;


@Service
public class CandidateLinkManager  implements CandidateLinkService {
	private  CandidateLinkDao candidateLinkDao;
	
	 @Autowired
	 public CandidateLinkManager(CandidateLinkDao candidateLinkDao) {
	        this.candidateLinkDao = candidateLinkDao;
	 }

	@Override
	public DataResult<List<CandidateLink>> getAll() {
		 return new SuccessDataResult<>(this.candidateLinkDao.findAll());
	}

	@Override
	public Result add(CandidateLink candidateLink) {
		 this.candidateLinkDao.save(candidateLink);
	    return new SuccessResult();
	}

	@Override
	public DataResult<List<CandidateLink>> getAllByCandidateId(int candidateId) {
		 return new SuccessDataResult<>(this.candidateLinkDao.getAllByCandidateId(candidateId));
	}

	@Override
	public Result addAll(List<CandidateLink> candidateLink) {
		candidateLinkDao.saveAll(candidateLink);
        return new SuccessResult();
		 
	}

}
