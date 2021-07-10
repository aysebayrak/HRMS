package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.FavoriteService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.FavoriteDao;
import kodlamaio.HRMS.entities.concretes.Favorite;


@Service
public class FavoriteManager implements FavoriteService{
	
	private FavoriteDao favoriteDao;
	

	@Autowired
	public FavoriteManager(FavoriteDao favoriteDao) {
		super();
		this.favoriteDao = favoriteDao;
	}

	@Override
	public Result add(Favorite favorite) {
		this.favoriteDao.save(favorite);
		return new SuccessResult("Favorite Eklendi");
	}

	@Override
	public Result delete(int id) {
		this.favoriteDao.deleteById(id);
		return  new SuccessResult("Favorite Silindi");
	}

	@Override
	public DataResult<List<Favorite>> getByCandidateId(int id) {
		return new SuccessDataResult<List<Favorite>>(this.favoriteDao.getByCandidate_id(id));
	}

}
