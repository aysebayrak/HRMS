package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.CandidateImage;

public interface CandidateImageService {
    Result add(CandidateImage candidateImage);
    DataResult<List<CandidateImage>> getAllByCandidateId(int candidateId);
    Result addAll(List<CandidateImage> candidateImage);
    DataResult<List<CandidateImage>> getAll();
    Result add(CandidateImage candidateImage, MultipartFile file);  //multi =pomexl kaydeleilen yapı sağladı
  

}
