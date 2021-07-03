package com.exception.controllerbased;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerException {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("homeMsg", "Hurray! Home controller launched suffessfully");

		/*
		 * if it is throwing error in below lines it will show ugly error message in UI
		 * to avoid this use @Exceptional method
		 */
		String vision = null;
		vision.length();

		return "home";
	}

	/*
	 * this is controller based exception handling. I'm commenting because of
	 * AppGloablException class is handling the null pointer exception.
	 */

//	@ExceptionHandler(value = NullPointerException.class)
//	public String handleNullPoineterException(Model model) {
//		model.addAttribute("msg","Oops Null pointer exception occured please try again later.");
//		return "error";
//	}

}
