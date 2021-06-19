package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.WorkPlaceService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.WorkPlaceDao;
import kodlamaio.HRMS.entities.concretes.WorkPlace;

@Service
public class WorkPlaceManager  implements WorkPlaceService{
	
	private WorkPlaceDao workPlaceDao;
	
	
   @Autowired
	public WorkPlaceManager(WorkPlaceDao workPlaceDao) {
		super();
		this.workPlaceDao = workPlaceDao;
	}



   @Override
   public DataResult<List<WorkPlace>> getAll() {
       return new SuccessDataResult<List<WorkPlace>>(this.workPlaceDao.findAll(),"Data listelendi");
   }
	

}
