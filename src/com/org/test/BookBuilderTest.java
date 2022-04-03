package com.org.test;

import com.org.builders.Book;

public class BookBuilderTest {
	
	public static void main(String[] args) {
		Book book = Book.getBookBuilder()
						.bookId(1)
						.bookTitle("Java")
						.build();
		System.out.println(book);
	}

}
