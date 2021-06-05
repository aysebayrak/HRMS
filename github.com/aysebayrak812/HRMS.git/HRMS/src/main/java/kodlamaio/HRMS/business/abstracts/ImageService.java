package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Image;

public interface ImageService {
	
	Result add(Image ımage);
	DataResult<List<Image>> getAll();

}
