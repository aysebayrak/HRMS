package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Language;
import java.util.List;

public interface LanguageService {
	
	Result add(Language language);
	DataResult<List<Language>>getAll();
	
	
	
	
;
}
