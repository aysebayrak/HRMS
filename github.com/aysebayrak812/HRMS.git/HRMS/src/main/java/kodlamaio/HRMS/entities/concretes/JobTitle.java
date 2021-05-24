package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//ÇOKLU CONST.
@NoArgsConstructor//PARAMETRESİZ
@Entity
@Table(name="job_titles")
public class JobTitle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//bir bir artti diye
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	

}
