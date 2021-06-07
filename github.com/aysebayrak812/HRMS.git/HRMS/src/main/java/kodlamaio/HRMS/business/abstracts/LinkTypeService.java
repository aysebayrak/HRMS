package kodlamaio.HRMS.business.abstracts;
import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.LinkType;

public interface LinkTypeService {
	 Result add(LinkType linkType);
	 DataResult<List<LinkType>> getAll();
	

}
