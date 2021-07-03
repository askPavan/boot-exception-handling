package com.exception.controllerbased;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerException {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("homeMsg", "Hurray home controller launched suffessfully");
		return "home";
	}
	
	/*
	 * this is controller based exception handling.
	 */
}
