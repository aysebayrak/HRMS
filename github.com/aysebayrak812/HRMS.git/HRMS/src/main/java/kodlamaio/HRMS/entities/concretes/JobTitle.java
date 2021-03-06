package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//ÇOKLU CONST.
@NoArgsConstructor//PARAMETRESİZ
@Entity
@Table(name="job_titles")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobPostings", "employerJobTitles" })
public class JobTitle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//bir bir artti diye
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	
	
	@OneToMany(mappedBy = "jobTitle")
	private List<JobPosting> jobPostings;
	
	

}
