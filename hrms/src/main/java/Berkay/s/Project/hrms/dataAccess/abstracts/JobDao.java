package Berkay.s.Project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Berkay.s.Project.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer> {

}
