package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.WorkTimeService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.WorkTimeDao;
import kodlamaio.HRMS.entities.concretes.WorkTime;


@Service
public class WorkTimeManager implements WorkTimeService {
	
	private WorkTimeDao workTimeDao;

	public WorkTimeManager(WorkTimeDao workTimeDao) {
		super();
		this.workTimeDao = workTimeDao;
	}

	@Override
	public DataResult<List<WorkTime>> getAll() {
		return new  SuccessDataResult<List<WorkTime>> (this.workTimeDao.findAll(),"Data Listelendi");
	}

}
