package pl.coderslab.classes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
	private final long id;
	private final String isbn;
	private final String title;
	private final String author;
	private final String publisher;
	private final String type;
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

}
