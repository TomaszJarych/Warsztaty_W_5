package pl.coderslab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.classes.Book;
import pl.coderslab.classes.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/hello")
	public String hello() {
		return "{hello:	World}";
	}

	@GetMapping("/helloBook")
	public Book helloBook() {
		return new Book(1L, "9788324631766", "Thinking	in	Java", "Bruce	Eckel", "Helion", "programming");
	}

	@GetMapping("/bookList")
	public List<Book> bookList() {
		return bookService.getList();
	}

	@GetMapping("/bookList/{id}")
	public Book bookById(@PathVariable("id") long id) {
		return bookService.getList().stream().filter(book -> book.getId() == id).findFirst().orElse(null);
	}

	@PostMapping("/bookList")
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}

	@PutMapping("/bookList/{id}")
	public void putBook(@PathVariable long id, @RequestBody Book book) {
		// na niemutowalnych obiektach podmienia się na nowy obiekt, bez wykorzystania
		// setterów i z polami klasy final
		 Book bookToChange = bookService.bookById(id);
		// bookService.removeBook(bookToChange);
		// bookService.addBook(book); wersja z niemutowalnymi obiektami

		bookToChange.setId(book.getId());
		bookToChange.setAuthor(book.getAuthor());
		bookToChange.setTitle(book.getTitle());
		bookToChange.setIsbn(book.getIsbn());
		bookToChange.setPublisher(book.getPublisher());
		bookToChange.setType(book.getType());
	}

	@DeleteMapping("/bookList/{id}")
	public void deleteBook(@PathVariable long id, @RequestBody Book book) {
		bookService.removeBook(bookService.bookById(id));
	}
}