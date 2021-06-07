package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.LanguageService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.LanguageDao;
import kodlamaio.HRMS.entities.concretes.Language;


@Service
public class LanguageManager  implements  LanguageService{
	 private  LanguageDao languageDao;

	 @Autowired
	 public LanguageManager(LanguageDao languageDao) {
	        this.languageDao = languageDao;
	 }

	@Override
	public Result add(Language language) {
	this.languageDao.save(language);
    return new SuccessResult();
	}

	@Override
	public DataResult<List<Language>> getAll() {
	return new SuccessDataResult<List<Language>>(this.languageDao.findAll());
	}

}
