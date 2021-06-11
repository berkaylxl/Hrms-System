package Berkay.s.Project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Berkay.s.Project.hrms.entities.concretes.Employee;



public interface EmployeeDao extends JpaRepository<Employee,Integer> {
 
}
