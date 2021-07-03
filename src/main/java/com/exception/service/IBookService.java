package com.exception.service;

import com.exception.userdefined.BookNotFoundException;

interface IBookService {
	public int findBookById(int bookId) throws BookNotFoundException;
}
