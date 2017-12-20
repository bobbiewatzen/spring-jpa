package com.jsun.site;

import com.jsun.site.entities.*;

import java.util.List;

public interface BookManager {
	List<Author> getAuthors();
	
	List<Book> getBooks();
	
	List<Publisher> getPublishers();
	
	void saveAuthor(Author author);
	
	void saveBook(Book book);
	
	void savePublisher(Publisher publisher);
}
