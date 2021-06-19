package kodlamaio.HRMS.business.abstracts;
import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.entities.concretes.WorkTime;



public interface WorkTimeService {
	DataResult<List<WorkTime>> getAll();

}
