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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_postings")	
//@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", shape = JsonFormat.Shape.STRING)
public class JobPosting { //iş ilanı

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	
	@Column(name="job_description") //,length = 3000
	//@Type(type="text")
	private String jobDescription; //iş tanımı 
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="open_position_count")
	private int openPositionCount; //açık pozisyon
	
	@Column(name="release_date")
	//@DateTimeFormat(iso = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
	//@JsonFormat(pattern = "YYYY-MM-dd HH:mm")
	private LocalDate releaseDate;     //yayınlanma tarihi
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;//son başvuru 
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="status" ,columnDefinition="-1")
	private int status;
	
	
	
	@ManyToOne()
	@JoinColumn(name="job_title_id")
	private JobTitle jobTitle;
	
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
    @ManyToOne()
    @JoinColumn(name = "work_place_id")
	private WorkPlace workPlace;
    
    @ManyToOne()
    @JoinColumn(name = "work_time_id")
    private WorkTime workTime;


	@OneToMany(mappedBy = "jobPosting")
	private List<Favorite> favorites;
   
	
	
	
	
	
	

}
