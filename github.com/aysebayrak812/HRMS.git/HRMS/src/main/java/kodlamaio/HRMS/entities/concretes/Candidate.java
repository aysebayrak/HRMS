package kodlamaio.HRMS.entities.concretes;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.HRMS.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="id")
@Table(name="candidates")
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
	
	
	
	

}
