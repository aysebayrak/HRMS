package kodlamaio.HRMS.business.concrete;

//import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobPostingSerivice;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
//import kodlamaio.HRMS.dataAccess.abstracts.CityDao;
//import kodlamaio.HRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HRMS.dataAccess.abstracts.JobPostingDao;
//import kodlamaio.HRMS.dataAccess.abstracts.JobTitleDao;
//import kodlamaio.HRMS.dataAccess.abstracts.WorkPlaceDao;
//import kodlamaio.HRMS.dataAccess.abstracts.WorkTimeDao;
import kodlamaio.HRMS.entities.concretes.JobPosting;
//import kodlamaio.HRMS.entities.dtos.JobPostingDto;


@Service
public class JobPostingManager  implements JobPostingSerivice{
	
	private JobPostingDao jobPostingDao;
//	private JobTitleDao jobTitleDao;
//	private EmployerDao employerDao;
//	private CityDao cityDao;
//    private WorkPlaceDao workPlaceDao;
//    private WorkTimeDao workTimeDao;
	
	

	 

    @Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
//		this.jobTitleDao = jobTitleDao;
//		this.employerDao = employerDao;
//		this.cityDao = cityDao;
//		this.workPlaceDao = workPlaceDao;
//		this.workTimeDao = workTimeDao;
	}



	@Override
	public DataResult<List<JobPosting>> getAll() {
	return new SuccessDataResult<List<JobPosting>>(jobPostingDao.findAll(),"Data Listeleni"); 
	}



//	@Override
//	public Result add(JobPostingDto jobPostDto) {
//		JobPosting jobPosting=new JobPosting();
//		jobPosting.setId(jobPostDto.getId());
//		jobPosting.setJobTitle(this.jobTitleDao.getById(jobPostDto.getJobTitleId()));
//		jobPosting.setEmployer(this.employerDao.getById(jobPostDto.getEmployerId()));
//        jobPosting.setJobDescription(jobPostDto.getJobDescription());
//        jobPosting.setCity(this.cityDao.getById(jobPostDto.getCityId()));
//        jobPosting.setMinSalary(jobPostDto.getMinSalary());
//        jobPosting.setMaxSalary(jobPostDto.getMaxSalary());
//        jobPosting.setOpenPositionCount(jobPostDto.getOpenPositionCount());
//        jobPosting.setReleaseDate(LocalDate.parse(jobPostDto.getReleaseDate()));		
//        jobPosting.setActive(false);
//        jobPosting.setWorkPlace(this.workPlaceDao.getById(jobPostDto.getWorkPlaceId()));
//        jobPosting.setWorkTime(this.workTimeDao.getById(jobPostDto.getWorkTimeId()));
//       this.jobPostingDao.save(jobPosting);
//      
//		
//		return new SuccessResult("İlan başarılı bir şekilde eklendi");
//	}



	@Override
	public Result add(JobPosting jobPosting) {
		 this.jobPostingDao.save(jobPosting);
		    return new SuccessResult("Başarılı");
	   
	}



	@Override
	public Result updateStatus(int status, int id) {
		this.jobPostingDao.updateStatus(status, id);
		return new SuccessResult();
	}


//
//	@Override
//	public DataResult<List<JobPosting>> getActiveJobPosting() {
//	   return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findByActive(true),"Aktif iş ilanları Listelendi");
//	}

}
