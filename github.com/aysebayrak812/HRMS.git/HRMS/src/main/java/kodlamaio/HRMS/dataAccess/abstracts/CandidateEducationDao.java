package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.CandidateEducation;

public interface CandidateEducationDao  extends   JpaRepository<CandidateEducation,Integer> {
	List<CandidateEducation> getAllByCandidateIdOrderByGraduationYear(int candidateId);
	//okul mezuniyete göre sıralamak için 
	
	List<CandidateEducation> getAllByCandidateId(int candidateId);
}
