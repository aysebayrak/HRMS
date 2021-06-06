package kodlamaio.HRMS.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidate_images")
public class CandidateImage {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="id")
	  private int id;
	  
	   @Column(name="url")
	    private String url;

	   @Column(name="uploaded_date") 
	   private LocalDateTime uploadedDate;  //"2 Ekim 2007, 13:45.30.123456789" 
	  
	  
	  @ManyToOne()
	 @JsonIgnore()
	  @JoinColumn(name = "candidate_id")
	  private Candidate candidate;

}
