package kodlamaio.HRMS.entities.dtos;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingFilterDto {
	
	private List<Integer> cityId;
	private List<Integer>  jobTitleId;
	private List<Integer> workPlaceId;
	private List<Integer> workTimeId;
	
	

}
