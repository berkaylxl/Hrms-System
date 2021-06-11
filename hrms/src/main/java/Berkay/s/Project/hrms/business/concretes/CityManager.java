package Berkay.s.Project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Berkay.s.Project.hrms.business.abstracts.CityService;
import Berkay.s.Project.hrms.core.utilities.results.DataResult;
import Berkay.s.Project.hrms.core.utilities.results.SuccessDataResult;
import Berkay.s.Project.hrms.dataAccess.abstracts.CityDao;
import Berkay.s.Project.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}


	@Override
	public DataResult<List<City>> getAll() {
	
		return new SuccessDataResult<List<City>>(
		this.cityDao.findAll(),"Şehirler Listelendi");	
				
				
		
	}

}
