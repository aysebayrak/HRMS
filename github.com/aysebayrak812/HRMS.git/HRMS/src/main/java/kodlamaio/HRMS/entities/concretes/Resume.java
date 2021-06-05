package kodlamaio.HRMS.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resumes")
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
    
	@ManyToOne()
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
	@Column(name="updated_date")
	private LocalDate updatedDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	
	@OneToMany(mappedBy="resume")
	private List<Language> languages;
	
	@OneToMany(mappedBy ="resume")
	private List<Technology>  techologies;
	
	
	@OneToMany(mappedBy = "resume")
	private List<Education> education;
	
	@OneToMany(mappedBy = "resume")
	private List<JobExperience> jobExperiences;
	
	
	@OneToMany(mappedBy = "resume")
	private List<Link> links;
	
	
	
	
	
	
}
