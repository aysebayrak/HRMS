package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Favorite;

public interface FavoriteDao extends JpaRepository<Favorite, Integer>{
	
List<Favorite> getByCandidate_id(int id);

}
