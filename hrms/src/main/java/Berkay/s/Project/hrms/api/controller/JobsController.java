package Berkay.s.Project.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Berkay.s.Project.hrms.business.abstracts.JobService;
import Berkay.s.Project.hrms.core.utilities.results.DataResult;
import Berkay.s.Project.hrms.core.utilities.results.Result;
import Berkay.s.Project.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	
	private JobService jobService;

	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	@GetMapping("/getall")
	public DataResult< List<Job>>getAll(){
		
		return this.jobService.getAll();
	}
	
	@GetMapping("/get")
	public DataResult<Job>get(int jobId){
		
		return this.jobService.get(jobId);
	}
	@PostMapping("/add")
	public Result add(Job job)
	{
		return this.jobService.add(job);
	}
	
	

}
