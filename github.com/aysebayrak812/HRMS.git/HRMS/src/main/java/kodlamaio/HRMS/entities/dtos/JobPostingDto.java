package kodlamaio.HRMS.entities.dtos;






import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingDto {
	
	
	private int id;
	private int jobTitleId;
	private int employerId;
	private String jobDescription;
	private int cityId;
	private int minSalary;
	private int maxSalary;
	private int openPositionCount;
	private String releaseDate;
	private boolean isActive;
    private int workPlaceId;
    private int workTimeId;
	
	
	
	

}
