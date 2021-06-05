package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Link;

public interface LinkService {
	
	Result add(Link link);
	DataResult<List<Link>>  getAll();
	

}
