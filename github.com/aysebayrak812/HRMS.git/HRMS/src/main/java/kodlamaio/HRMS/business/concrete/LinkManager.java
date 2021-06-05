package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.LinkService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.LinkDao;
import kodlamaio.HRMS.entities.concretes.Link;


@Service
public class LinkManager implements LinkService {
	
	private LinkDao linkDao;

	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}

	@Override
	public Result add(Link link) {
		linkDao.save(link);
		return new SuccessResult("Başarı ile eklendi");
	}

	@Override
	public DataResult<List<Link>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
