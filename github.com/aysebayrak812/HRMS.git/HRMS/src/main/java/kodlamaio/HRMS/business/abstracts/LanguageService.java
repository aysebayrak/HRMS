package kodlamaio.HRMS.business.abstracts;
import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Language;

public interface LanguageService {
    Result add(Language language);
    DataResult<List<Language>> getAll();

}
