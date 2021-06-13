package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Candidate;
import kodlamaio.HRMS.entities.dtos.CVDto;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	DataResult<Candidate> getByNationalIdentity(String  nationalIdentity);
	DataResult<Candidate> getByEmail(String email);
	Result add(Candidate candidate);
	
	
	DataResult<Candidate> getById(int id);
	DataResult<CVDto> getResumeByCandidateId(int candidateId);
	

}
