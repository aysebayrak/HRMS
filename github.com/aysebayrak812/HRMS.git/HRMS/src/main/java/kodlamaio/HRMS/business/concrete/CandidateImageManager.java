package kodlamaio.HRMS.business.concrete;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.business.abstracts.CandidateImageService;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.core.utilities.ımageCloudinary.ImageService;
import kodlamaio.HRMS.dataAccess.abstracts.CandidateImageDao;
import kodlamaio.HRMS.entities.concretes.CandidateImage;



@Service
public class CandidateImageManager  implements CandidateImageService{
	
	private CandidateImageDao candidateImageDao;
	private ImageService imageService;

	
	@Autowired
	public CandidateImageManager(CandidateImageDao candidateImageDao, ImageService imageService) {
		super();
		this.candidateImageDao = candidateImageDao;
		this.imageService = imageService;
	}

	@Override
	public Result add(CandidateImage candidateImage) {
	  this.candidateImageDao.save(candidateImage);
	  return new SuccessResult();
	}

	@Override
	public DataResult<List<CandidateImage>> getAllByCandidateId(int candidateId) {
		return new SuccessDataResult<List<CandidateImage>>(this.candidateImageDao.getAllByCandidateId(candidateId));
	}

	@Override
	public Result addAll(List<CandidateImage> candidateImage) {
		candidateImageDao.saveAll(candidateImage);
		 return new SuccessResult();
		
	}

	@Override
	public DataResult<List<CandidateImage>> getAll() {
		return new SuccessDataResult<List<CandidateImage>>(this.candidateImageDao.findAll());
	}

	@Override
	public Result add(CandidateImage candidateImage, MultipartFile file) {
	   Map<String ,String> result =(Map<String,String>) imageService.save(file).getData();
	   String url = result.get("url");
	   candidateImage.setUrl(url);
	   candidateImage.setUploadedDate(LocalDate.now());
	   return add(candidateImage);
	   
	}
}
