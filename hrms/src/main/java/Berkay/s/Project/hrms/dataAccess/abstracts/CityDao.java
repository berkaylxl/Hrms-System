package Berkay.s.Project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Berkay.s.Project.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City,Integer> {
	
	

}
