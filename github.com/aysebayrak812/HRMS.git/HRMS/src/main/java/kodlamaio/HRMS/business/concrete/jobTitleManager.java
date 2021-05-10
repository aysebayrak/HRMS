package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.jopTitleService;
import kodlamaio.HRMS.dataAccess.abstracts.jobTitleDao;
import kodlamaio.HRMS.entities.concretes.jobTitle;
@Service
public class jobTitleManager implements jopTitleService {
	
	private jobTitleDao joptitleDao;

	public jobTitleManager(jobTitleDao joptitleDao) {
		super();
		this.joptitleDao = joptitleDao;
	}

	@Override
	public List<jobTitle> getAll() {
		return this.joptitleDao.findAll();
	}
	

}
