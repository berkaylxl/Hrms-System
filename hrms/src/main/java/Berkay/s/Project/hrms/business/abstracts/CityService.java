package Berkay.s.Project.hrms.business.abstracts;

import java.util.List;

import Berkay.s.Project.hrms.core.utilities.results.DataResult;
import Berkay.s.Project.hrms.entities.concretes.City;

public interface CityService {
	
	DataResult<List<City>>getAll();
	

}
