package Berkay.s.Project.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Berkay.s.Project.hrms.business.abstracts.CityService;
import Berkay.s.Project.hrms.core.utilities.results.DataResult;
import Berkay.s.Project.hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CitysController {
	
	private CityService cityService;

	
	public CitysController(CityService cityService) {
		super();
		this.cityService = cityService;
	}

	@GetMapping("/getall")
	public DataResult<List<City>>getAll(){
		
		return this.cityService.getAll();
	}
	
}
