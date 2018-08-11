package pl.coderslab.classes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
	private  long id;
	private  String isbn;
	private  String title;
	private  String author;
	private  String publisher;
	private  String type;
	@JsonCreator
	public Book(@JsonProperty("id")long id,@JsonProperty("isbn") String isbn, @JsonProperty("title")String title,
			@JsonProperty("author")String author, @JsonProperty("publisher")String publisher, 
			@JsonProperty("type")String type) {
		
		this.id = id;
		
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getType() {
		return type;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
