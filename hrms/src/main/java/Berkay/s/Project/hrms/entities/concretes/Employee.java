package Berkay.s.Project.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employees")
 
public class Employee {
   
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String Lastname;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birthday_date")
	private Date birthdayDate;
	
	public Employee()
	{
		
	}
	public Employee(String firstName, String lastname, String identityNumber, Date birthdayDate) {
		super();
		this.firstName = firstName;
		Lastname = lastname;
		this.identityNumber = identityNumber;
		this.birthdayDate = birthdayDate;
	}
	

}
