package kodlamaio.HRMS.configurations;

import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


import kodlamaio.HRMS.core.utilities.ımageCloudinary.CloudinaryImageManager;
import kodlamaio.HRMS.core.utilities.ımageCloudinary.ImageService;

public class AppConfigurationİmage {
	
	@Bean
	private Cloudinary cloudinaryService() {
		return new Cloudinary(ObjectUtils.asMap(
				 "cloud_name", "dsmsdb3va",
				 "api_key", "858863788752464",
				 "api_secret", "MXpQkvHItkrOwDAd2nFl8mOC7GM"
				
				));
	}
	
  @Bean
  public ImageService imageService() {
	  return new  CloudinaryImageManager(cloudinaryService());
	  
  }

}
