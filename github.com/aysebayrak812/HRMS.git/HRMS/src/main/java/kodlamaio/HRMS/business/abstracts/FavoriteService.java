package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Favorite;

public interface FavoriteService {
	Result add(Favorite favorite);
	Result delete(int id);
	DataResult<List<Favorite>> getByCandidateId(int id);
	

}
