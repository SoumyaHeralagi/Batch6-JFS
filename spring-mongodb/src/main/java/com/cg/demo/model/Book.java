package com.cg.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Book {
    
	@Id
	private int id;
	private String bookName;
	private String authorName;
	public int getId() {
		return this.id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
