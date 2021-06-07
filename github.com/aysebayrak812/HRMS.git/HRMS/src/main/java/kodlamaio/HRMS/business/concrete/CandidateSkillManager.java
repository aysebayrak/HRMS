package kodlamaio.HRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CandidateSkillService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateSkillDao;
import kodlamaio.HRMS.entities.concretes.CandidateSkill;

@Service
public class CandidateSkillManager  implements CandidateSkillService{
	
	   private   CandidateSkillDao candidateSkillDao;

	    @Autowired
	    public CandidateSkillManager(CandidateSkillDao candidateSkillDao) {
	      this.candidateSkillDao = candidateSkillDao;
	    }

	@Override
	public Result add(CandidateSkill candidateSkill) {
		 this.candidateSkillDao.save(candidateSkill);
	        return new SuccessResult();
	}

	@Override
	public DataResult<List<CandidateSkill>> getAll() {
		  return new SuccessDataResult<>(this.candidateSkillDao.findAll());
	}

	@Override
	public DataResult<List<CandidateSkill>> getAllByCandidateId(int candidateId) {
		  return new SuccessDataResult<>(this.candidateSkillDao.getAllByCandidateId(candidateId));
	}

	@Override
	public Result addAll(List<CandidateSkill> candidateSkill) {
		 candidateSkillDao.saveAll(candidateSkill);
	     return new SuccessResult();
	}

}
