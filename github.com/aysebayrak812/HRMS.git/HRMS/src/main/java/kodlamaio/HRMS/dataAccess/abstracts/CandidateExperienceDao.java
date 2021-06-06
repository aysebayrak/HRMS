package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.CandidateExperience;

public interface CandidateExperienceDao  extends JpaRepository<CandidateExperience,Integer>{  //deneyim
    List<CandidateExperience> getAllByCandidateIdOrderByLeaveDateDesc(int candidateId); //işten ayrılış tarihine göre

}
