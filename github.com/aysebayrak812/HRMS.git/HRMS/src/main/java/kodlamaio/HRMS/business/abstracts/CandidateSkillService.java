package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.CandidateSkill;

public interface CandidateSkillService { //beceri
	 Result add(CandidateSkill candidateSkill);
	 DataResult<List<CandidateSkill>> getAll();
	 DataResult<List<CandidateSkill>> getAllByCandidateId(int candidateId);
	 Result addAll(List<CandidateSkill> candidateSkill);

	 
	 Result update(CandidateSkill candidateSkill);
}
