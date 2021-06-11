package Berkay.s.Project.hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Berkay.s.Project.hrms.business.abstracts.UserService;
import Berkay.s.Project.hrms.core.utilities.results.Result;
import Berkay.s.Project.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	
	private UserService userService;
    @Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
    @PostMapping("/add")
    
	public Result add(User user)
	{
		return this.userService.Add(user);
	}
	
	
	
	
	

}
