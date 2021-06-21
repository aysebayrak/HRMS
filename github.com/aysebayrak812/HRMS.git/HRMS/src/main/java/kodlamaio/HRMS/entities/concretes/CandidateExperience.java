package kodlamaio.HRMS.entities.concretes;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidate_exp")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
public class CandidateExperience {  //deneyim
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	@NotNull
	@NotBlank
	private String companyName;
	
	
	@Column(name="position")
    @NotNull
    @NotBlank
	private String position;
	
    @Column(name = "start_date")
    @NotNull
    private LocalDate startDate;

    @Column(name = "leave_date")  //ayrılma tarihi
    private LocalDate leaveDate;
	
	
	@ManyToOne()
	@JsonIgnore()
	@JoinColumn(name="candidate_id")
	private Candidate  candidate;
 
}
