package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.CandidateEducation;

public interface CandidateEducationService {
	 Result add(CandidateEducation candidateEducation);

	 Result addAll(List<CandidateEducation> candidateEducation);  //çoklu ekleme 
	 DataResult<List<CandidateEducation>> getAll();
	 DataResult<List<CandidateEducation>> getAllByCandidateIdOrderByGraduationYear(int candidateId);//mezuniyete göre
	 
	

}
