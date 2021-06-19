package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.entities.concretes.WorkPlace;

public interface WorkPlaceService {
	DataResult<List<WorkPlace>> getAll();
	
	

}
