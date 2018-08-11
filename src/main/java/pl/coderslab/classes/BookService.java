package pl.coderslab.classes;

import java.util.List;

public interface BookService {
	
	public List<Book> getList();
	void addBook(Book book);
	public Book bookById(long id);
	public void removeBook(Book book);
}
