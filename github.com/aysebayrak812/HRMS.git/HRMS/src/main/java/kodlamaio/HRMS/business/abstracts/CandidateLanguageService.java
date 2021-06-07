package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.CandidateLanguage;

public interface CandidateLanguageService {
	 Result add(CandidateLanguage candidateLanguage);
	 DataResult<List<CandidateLanguage>> getAllByCandidateId(int candidateId);
	 Result addAll(List<CandidateLanguage> candidateLanguage);//hepsini ekle 
	 DataResult<List<CandidateLanguage>> getAll();
	    

}
