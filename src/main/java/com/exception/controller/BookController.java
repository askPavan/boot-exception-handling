package com.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exception.service.BookServiceImpl;
import com.exception.userdefined.BookNotFoundException;

@Controller
public class BookController {

	@Autowired
	BookServiceImpl bookService;
	
	@GetMapping("/findBookId")
	public String findBookById(Model model, @RequestParam("bookId") int bookId) throws BookNotFoundException {
	
		int bookPrice = bookService.findBookById(bookId);
		
		if(bookPrice == 500) {
			model.addAttribute("bookPrice","Book Price is : "+bookPrice);
			return "display";
		}
		else {
			model.addAttribute("msg", "Oops Error occured in finding the book price..");
			return "error";
		}
	}
	
}
