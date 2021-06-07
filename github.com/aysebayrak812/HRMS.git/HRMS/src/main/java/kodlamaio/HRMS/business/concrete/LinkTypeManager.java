package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.LinkTypeService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.LinkTypeDao;
import kodlamaio.HRMS.entities.concretes.LinkType;


@Service
public class LinkTypeManager   implements LinkTypeService{
	
	 private  LinkTypeDao linkTypeDao;

	 @Autowired
	 public LinkTypeManager(LinkTypeDao linkTypeDao) {
	 this.linkTypeDao = linkTypeDao;
	  }

	@Override
	public Result add(LinkType linkType) {
		 this.linkTypeDao.save(linkType);
	        return new SuccessResult();
	}

	@Override
	public DataResult<List<LinkType>> getAll() {
	return new SuccessDataResult<>(this.linkTypeDao.findAll());
	}

}
