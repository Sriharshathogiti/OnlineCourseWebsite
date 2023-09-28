package com.example.Controller.SpringBootTask1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Controller.model.User;
import com.example.Controller.repo.UserRepository;

@Controller
public class IndexController {

	@Autowired
	public UserRepository userRepo;
	
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user,Model model) {
		System.out.println(user.toString());
		//validate
//		System.out.println(user.getUsername());
//		System.out.println(user.getEmail());
//		System.out.println(user.getMno());
//		System.out.println(user.getCourse());
		
		
	User user_inserted= userRepo.save(user);
	System.out.println(user_inserted);
		model.addAttribute("message", user_inserted.getCourse()+"  enroll.");
		model.addAttribute("name",user_inserted.getUserName()+"  welcome" );
		
		return "welcome";
	}
}