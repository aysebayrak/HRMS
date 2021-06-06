package kodlamaio.HRMS.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.CandidateImage;

public interface CandidateImageDao   extends JpaRepository<CandidateImage,Integer>{
	  List<CandidateImage> getAllByCandidateId(int candidateId); //id ye getir hepisni 
	

}
