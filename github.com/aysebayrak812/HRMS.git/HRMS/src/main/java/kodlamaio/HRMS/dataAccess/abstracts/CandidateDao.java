package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Candidate;



public interface CandidateDao  extends JpaRepository<Candidate, Integer>{

}
