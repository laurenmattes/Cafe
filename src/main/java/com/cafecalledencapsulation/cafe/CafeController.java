package com.cafecalledencapsulation.cafe;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

	@RequestMapping("/login")
	public ModelAndView showLogin() {
		return new ModelAndView("/login");
	}

	@PostMapping("/login")
	// get the username and password from the form when it's submitted.
	public ModelAndView submitLoginForm(@RequestParam("username") String username,
			@RequestParam("password") String password, HttpSession session, RedirectAttributes redir) {
		// Find the matching user.
		Users aUser = userDao.findByUsername("username");
		if (aUser == null || !password.equals(aUser.getPassword())) {
			// If the user or password don't match, display an error message.
			ModelAndView mav = new ModelAndView("login");
			mav.addObject("message", "Incorrect username or password.");
			return mav;
		}

		// On successful login, add the user to the session.
		session.setAttribute("profile", aUser);

		// A flash message will only show on the very next page. Then it will go away.
		// It is useful with redirects since you can't add attributes to the mav.
		redir.addFlashAttribute("message", "Logged in.");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
		// invalidate clears the current user session and starts a new one.
		session.invalidate();

		// A flash message will only show on the very next page. Then it will go away.
		// It is useful with redirects since you can't add attributes to the mav.
		redir.addFlashAttribute("Logged out.");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/user-registration")
	public ModelAndView showUserRegistration() {

		return new ModelAndView("/user-registration");

	}
//
//	@RequestMapping("/user-registration-result")
//	public ModelAndView submitUserReg(Users aUser) {
//		userDao.create(aUser);
////		ModelAndView mav = new ModelAndView("user-registration-result", "users", aUser);
//		return new ModelAndView("/user-registration-result");
//	}

	@RequestMapping("/admin")
	public ModelAndView showAdmin() {
		List<Item> lelistOfItems = itemDao.findAll();
		ModelAndView mav = new ModelAndView("admin", "items", lelistOfItems);
		return mav;
	}

	@RequestMapping("/add-item")
	public ModelAndView addItem() {
		return new ModelAndView("/add-item");
	}

	@PostMapping("/add-item")
	public ModelAndView submitCreateForm(Item aItem) {
		itemDao.create(aItem);

		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping("/item/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		itemDao.delete(id);
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping("/item/update")
	public ModelAndView showEditForm(@RequestParam("id") Long id) {

		ModelAndView mav = new ModelAndView("edit-item");

		mav.addObject("item", itemDao.findById(id));
		// mav.addObject("title", "Edit Food");
		return mav;
	}

	@PostMapping("/item/update")
	public ModelAndView submitEditForm(Item aItem) {

		itemDao.update(aItem);
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping("/user-registration-result")
	public ModelAndView showEditProfile(@SessionAttribute(name = "profile", required = false) Users aUser) {
		return new ModelAndView("user-registration-result", "users", aUser);
	}

	// Use HttpSession to set an attribute on the session
	@PostMapping("/user-registration-result")
	public ModelAndView submitEditProfile(Users aUser, HttpSession session) {
		session.setAttribute("profile", aUser);
		userDao.create(aUser);
		ModelAndView mav = new ModelAndView("redirect:/");
		return mav;
	}

//	@RequestMapping("/user-registration-result")
	/*
	 * public ModelAndView showCreateForm() { // userDao.create(aUser); ModelAndView
	 * mav = new ModelAndView("user-registration-result", "users", aUser); return
	 * mav;
	 */
//	}

}
