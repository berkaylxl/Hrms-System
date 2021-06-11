package Berkay.s.Project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Berkay.s.Project.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{

	
}
