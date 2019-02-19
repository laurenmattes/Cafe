package com.cafecalledencapsulation.cafe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CafeController {

//this is the first controller that tells us where the homepage lives.
	@RequestMapping("/")
	public ModelAndView showCafeHome() {
		ModelAndView mav = new ModelAndView("index");

		return mav;
	}

	@RequestMapping("/user-registration")
	public ModelAndView showUserRegistration() {

		ModelAndView mav = new ModelAndView("user-registration");
		return mav;

	}

	@RequestMapping
	public ModelAndView submitUserReg(Users aUser) {
		return new ModelAndView("/user-registration-result");

	}

	@PostMapping
	public ModelAndView submitUserRegSecure(Users aUser) {
		return new ModelAndView("/user-registration-result");

	}
}
