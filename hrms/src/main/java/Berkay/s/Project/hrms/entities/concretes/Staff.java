package Berkay.s.Project.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="staff")
public class Staff {
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column (name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	

}
