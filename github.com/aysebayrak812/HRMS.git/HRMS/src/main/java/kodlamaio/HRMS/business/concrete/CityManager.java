package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CityService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.CityDao;
import kodlamaio.HRMS.entities.concretes.City;


@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}



	@Override
	public DataResult<List<City>> getAll() {
	return    new SuccessDataResult<List<City>>(cityDao.findAll(),"Data Listelendi");
	}

}
