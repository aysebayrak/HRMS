package kodlamaio.HRMS.core.utilities.─▒mageCloudinary;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.core.utilities.result.DataResult;

public interface ImageService {
	DataResult<?> save(MultipartFile file);

}
