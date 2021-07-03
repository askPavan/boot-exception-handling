package com.exception.global;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppGlobalException {

	/*
	 * this method will handle all the application NULLPOINTEREXCETIONS
	 */
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model) {
		model.addAttribute("msg","Null pointer exception occured in the application, please try again later...");
		return "error";
	}
}
