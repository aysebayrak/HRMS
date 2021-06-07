package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.dtos.CVDto;

public interface CvService {
	Result add(CVDto cvDto,int candidateId);

}
