package Berkay.s.Project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="password")
	private String password;
	
    public User()
    {
    	
    }

	public User(int userId,String mail, String password) {
		super();
		this.userId=userId;
		this.mail = mail;
		this.password = password;
	}
}
