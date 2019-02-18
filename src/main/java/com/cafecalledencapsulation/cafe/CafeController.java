package com.cafecalledencapsulation.cafe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/user-registration-result")
	public ModelAndView showUserRegistrationResult(@RequestParam("firstname") String firstname) {

		ModelAndView mav = new ModelAndView("user-registration-result");
		mav.addObject("firstname", firstname);
		return mav;
	}

}
