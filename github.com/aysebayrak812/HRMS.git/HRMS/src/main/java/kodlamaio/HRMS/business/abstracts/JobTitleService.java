package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.JobTitle;



public interface JobTitleService {
     DataResult<List<JobTitle>>  getAll();
     DataResult<JobTitle> getByTitle(String title);
     Result add(JobTitle jobTitle);
}
