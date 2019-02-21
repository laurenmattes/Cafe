package com.cafecalledencapsulation.cafe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cafecalledencapsulation.cafe.dao.ItemDao;
import com.cafecalledencapsulation.cafe.dao.UserDao;

@Controller
public class CafeController {

//this is the first controller that tells us where the homepage lives.
	@Autowired
	private ItemDao itemDao;

	@Autowired
	private UserDao userDao;

	@RequestMapping("/")
	public ModelAndView showCafeHome() {

		List<Item> leListOfItems = itemDao.findAll();

		return new ModelAndView("list", "items", leListOfItems);

	}

	@RequestMapping("/user-registration")
	public ModelAndView showUserRegistration() {

		ModelAndView mav = new ModelAndView("user-registration");
		return mav;

	}

	@RequestMapping("/add-item")
	public ModelAndView addItem() {
		return new ModelAndView("/add-item");
	}

	@RequestMapping("/user-registration-result")
	public ModelAndView submitUserReg(Users aUser) {
		userDao.create(aUser);
		return new ModelAndView("/user-registration-result");

	}

	@RequestMapping("/admin")
	public ModelAndView showAdmin() {
		List<Item> lelistOfItems = itemDao.findAll();
		ModelAndView mav = new ModelAndView("admin", "items", lelistOfItems);
		return mav;
	}

	@PostMapping("/add-item")
	public ModelAndView submitCreateForm(Item aItem) {
		itemDao.create(aItem);

		return new ModelAndView("redirect:/admin");
	}
}
