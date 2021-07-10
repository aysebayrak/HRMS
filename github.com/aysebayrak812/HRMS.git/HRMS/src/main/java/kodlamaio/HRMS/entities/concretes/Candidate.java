package kodlamaio.HRMS.entities.concretes;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.HRMS.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = true) //data yı baştan başlat
@Entity
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="id")
@Table(name="candidates")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Candidate extends User{
	
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="national_identity")
	private String nationalIdentity;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	
	@OneToMany(mappedBy = "candidate")
	private List<CandidateEducation> candidateEducations;
	
	@OneToMany(mappedBy = "candidate")
	 private List<CandidateImage> candidateImages;

	@OneToMany(mappedBy = "candidate")
	private List<CandidateExperience> candidateExperiences;

	@OneToMany(mappedBy = "candidate")
	private List<CandidateLanguage> candidateLanguages;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateLink> candidateLinks;

    @OneToMany(mappedBy = "candidate")
	private List<CandidateSkill> candidateSkills;
	
    
    @OneToMany(mappedBy = "candidate")
	private List<Favorite> favorites;
	
	

}
