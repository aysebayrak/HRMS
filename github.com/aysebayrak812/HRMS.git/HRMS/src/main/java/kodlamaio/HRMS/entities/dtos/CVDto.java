package kodlamaio.HRMS.entities.dtos;

import java.util.List;

import javax.validation.Valid;



import com.fasterxml.jackson.annotation.JsonIgnore;

import kodlamaio.HRMS.entities.abstracts.Dto;
import kodlamaio.HRMS.entities.concretes.Candidate;
import kodlamaio.HRMS.entities.concretes.CandidateEducation;
import kodlamaio.HRMS.entities.concretes.CandidateExperience;
import kodlamaio.HRMS.entities.concretes.CandidateImage;
import kodlamaio.HRMS.entities.concretes.CandidateLanguage;
import kodlamaio.HRMS.entities.concretes.CandidateLink;
import kodlamaio.HRMS.entities.concretes.CandidateSkill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CVDto  implements Dto{
	
	@JsonIgnore()
	private Candidate canidate;  //bir tane id dönecek
	
	private List<@Valid CandidateEducation> candidateEducations;
	private List<@Valid CandidateExperience> candidateExperiences;
	private List<@Valid CandidateImage> candidateImages;
	private List<@Valid CandidateLanguage> candidateLanguages;
	private List<@Valid CandidateLink> candidateLinks;
	private List<@Valid CandidateSkill> candidateSkills;
	
	//list ile birden fazla getirmeyi sağladık

}
