package com.exception.service;

import org.springframework.stereotype.Service;

import com.exception.userdefined.BookNotFoundException;

@Service
public class BookServiceImpl implements IBookService {

	@Override
	public int findBookById(int bookId) throws BookNotFoundException {

		if(bookId == 101) {
			return 500;
		}
		else {
			throw new BookNotFoundException("book not found for the given id..... ");
		}
	}

}
