package com.jsun.site;

import com.jsun.site.entities.Book;

public interface BookRepository extends GenericRepository<Long, Book> {
	Book getByIsbn(String isbn);
}
