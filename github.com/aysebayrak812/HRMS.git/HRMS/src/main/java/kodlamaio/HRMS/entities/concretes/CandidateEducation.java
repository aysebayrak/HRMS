package kodlamaio.HRMS.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidate_edu")
public class CandidateEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
    @Column(name="edu_name")
    @NotBlank
    @NotNull
	private String schoolName;
    
    
    @Column(name="department_name")
    @NotBlank
    @NotNull
    private String departmentName;
	
    @Column(name="start_year")
    @NotNull
    private int startYear;
	
    @Column(name="graduation_year")
    private int graduationYear;
    
	@ManyToOne()
    @JsonIgnore()  //yok sayılacak özellik
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	

}
