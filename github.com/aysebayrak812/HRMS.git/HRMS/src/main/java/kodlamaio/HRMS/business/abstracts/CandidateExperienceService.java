package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.CandidateExperience;

public interface CandidateExperienceService {
	  Result add(CandidateExperience candidateExperience);
	  Result addAll(List<CandidateExperience> candidateExperience);
	  DataResult<List<CandidateExperience>> getAll();
	  DataResult<List<CandidateExperience>> getAllByCandidateIdOrderByLeaveDate(int candidateId); //işten arılma tarihine göre

}
