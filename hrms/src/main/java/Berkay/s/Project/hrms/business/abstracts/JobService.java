package Berkay.s.Project.hrms.business.abstracts;

import java.util.List;

import Berkay.s.Project.hrms.core.utilities.results.DataResult;
import Berkay.s.Project.hrms.core.utilities.results.Result;
import Berkay.s.Project.hrms.entities.concretes.Job;

public interface JobService {
	DataResult< List<Job>> getAll();
	DataResult<Job> get(int jobId);
    Result  add(Job job);
    Result delete(Job job);
   
	
 

}