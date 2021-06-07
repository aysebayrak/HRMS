package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.ErrorResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateDao;
import kodlamaio.HRMS.entities.concretes.Candidate;


@Service
public class CandidateManager implements CandidateService {
	
private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
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

}
