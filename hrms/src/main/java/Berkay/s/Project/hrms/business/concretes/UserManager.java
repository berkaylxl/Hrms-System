package Berkay.s.Project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Berkay.s.Project.hrms.business.abstracts.UserService;
import Berkay.s.Project.hrms.core.utilities.results.Result;
import Berkay.s.Project.hrms.core.utilities.results.SuccessResult;
import Berkay.s.Project.hrms.dataAccess.abstracts.UserDao;
import Berkay.s.Project.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result Add(User user) {
		
	  this.userDao.save(user);
	  return new SuccessResult();
		
		
	}

}
