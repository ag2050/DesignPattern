package com.org.builders;

public class Book {

	private Integer bookId;
	private final String bookTitle;
	private final String bookDescription;
	private Integer authorId;
	private final String authorName;

	private Book(BookBuilder bookBuilder) {
		this.bookId = bookBuilder.bookId;
		this.bookTitle = bookBuilder.bookTitle;
		this.bookDescription = bookBuilder.bookDescription;
		this.authorId = bookBuilder.authorId;
		this.authorName = bookBuilder.authorName;
	}

	public Integer getBookId() {
		return bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public static BookBuilder getBookBuilder() {
		return new BookBuilder();
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookDescription=" + bookDescription
				+ ", authorId=" + authorId + ", authorName=" + authorName + "]";
	}

	public static class BookBuilder {
		private Integer bookId;
		private String bookTitle;
		private String bookDescription;
		private Integer authorId;
		private String authorName;

		public BookBuilder bookId(Integer bookId) {
			this.bookId = bookId;
			return this;
		}

		public BookBuilder bookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
			return this;
		}

		public BookBuilder bookDescription(String bookDescription) {
			this.bookDescription = bookDescription;
			return this;
		}

		public BookBuilder authorId(Integer authorId) {
			this.authorId = authorId;
			return this;
		}

		public BookBuilder authorName(String authorName) {
			this.authorName = authorName;
			return this;
		}

		public Book build() {
			return new Book(this);
		}

	}

}
