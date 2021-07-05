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
	
	@ExceptionHandler(value = Exception.class)
	public String handleException(Model model) {
		model.addAttribute("msg", "Error occured Book rate not found in the application....");
		return "error";
	}
}
