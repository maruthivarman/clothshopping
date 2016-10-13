package com.niit.clothstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.User;
import com.niit.service.UserDAO;

@Controller
public class UserController {

	@Autowired
	private User user;
	
	@Autowired
	private UserDAO userDAO;
	
	
	@RequestMapping("/getlogin")
	public ModelAndView getlogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@RequestMapping("getsignup")
	public ModelAndView getsignup() {
		ModelAndView mv = new ModelAndView("signup");
		return mv;
	}

	@RequestMapping("newUser")
	public ModelAndView newUser(@ModelAttribute User user){
	/*public ModelAndView newUser(@RequestParam("username") String username,@RequestParam("emailid") String emailid, @RequestParam("password") String password,
			@RequestParam("mobile_number") long mobile_number, @RequestParam("gender") String gender,
			@RequestParam("address") String address) {
		user.setUsername(username);
		user.setPassword(password);
		user.setEmailid(emailid);
		user.setMobile_number(mobile_number);
		user.setAddress(address);
		user.setGender(gender);*/
		
		userDAO.insertUser(user);
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
}
