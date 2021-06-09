package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import kodlamaio.HRMS.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Employee  extends User {
	
	public Employee(int id, String email, String password, @NotBlank String firstName, @NotBlank String lastName) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	 @Column(name = "first_name")
	    @NotBlank
	    private String firstName;

	    @Column(name = "last_name")
	    @NotBlank
	    private String lastName;

	
	

}
