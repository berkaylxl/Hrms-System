package Berkay.s.Project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employer {
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_adress")
	private String web_Adress;
	
	@Column(name="phone_number")
	private String phone_Number;
	
	@Column(name="is_verified")
	private Boolean is_Verified;
	
	public Employer()
	{
		
	}

	public Employer(String company_name, String web_Adress, String phone_Number, Boolean is_Verified) {
		super();
		this.company_name = company_name;
		this.web_Adress = web_Adress;
		this.phone_Number = phone_Number;
		this.is_Verified = is_Verified;
	}
    
}
