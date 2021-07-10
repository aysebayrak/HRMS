package kodlamaio.HRMS.business.abstracts;
import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.CandidateLink;

public interface CandidateLinkService {
	   DataResult<List<CandidateLink>> getAll();
	   Result add(CandidateLink candidateLink);
	   DataResult<List<CandidateLink>> getAllByCandidateId(int candidateId);
	   Result addAll(List<CandidateLink> candidateLink);//savaall mantığında

	   Result update(CandidateLink candidateLink);
}
