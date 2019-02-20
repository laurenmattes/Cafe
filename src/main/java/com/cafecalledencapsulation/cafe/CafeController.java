package com.cafecalledencapsulation.cafe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cafecalledencapsulation.cafe.dao.ItemDao;

@Controller
public class CafeController {

//this is the first controller that tells us where the homepage lives.
	@Autowired
	private ItemDao itemDao;

	@RequestMapping("/")
	public ModelAndView showCafeHome() {
		ModelAndView mav = new ModelAndView("index");

		List<Item> leListOfItems = itemDao.findAll();
		System.out.println(leListOfItems);
		return new ModelAndView("list", "items", leListOfItems);

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

}
