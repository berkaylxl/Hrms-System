package Berkay.s.Project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Berkay.s.Project.hrms.core.utilities.results.DataResult;
import Berkay.s.Project.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer> {

}
