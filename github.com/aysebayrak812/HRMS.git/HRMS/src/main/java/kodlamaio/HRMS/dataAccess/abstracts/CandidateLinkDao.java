package kodlamaio.HRMS.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.CandidateLink;

public interface CandidateLinkDao  extends JpaRepository<CandidateLink,Integer> {
	 List<CandidateLink> getAllByCandidateId(int candidateId);
}
