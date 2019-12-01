package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController<listUsers> {

	@GetMapping("/user")
	public String users (Model model)
	{
          model.addAttribute("Users",getUsersList() );
          return "userList";     	
	}

	private listUsers getUsersList() 
	{
		
		List<User> userList=new ArrayList<User>();
		userList.add(new User(1, "vikram", "pune"));
		userList.add(new User(2, "vikram1", "Mumbai"));
		userList.add(new User(3, "john", "Mumbai"));
		return (listUsers) userList;
	}	

}
	
	
	