package com.gcit.jdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.gcit.jdbc.dao.AuthorDAO;
import com.gcit.jdbc.dao.BookDAO;
import com.gcit.jdbc.entity.Author;
import com.gcit.jdbc.entity.Book;

public class AdministratorService {
	
	public List<Book> getAllBooks() throws SQLException {
		
		BookDAO bd = new BookDAO();
		AuthorDAO ad = new AuthorDAO();
		List<Book> books = bd.readAll();
		
		for(Book b : books) {
			b.setAuthors(ad.readAllByBook(b));
		}
		
		return books;
	}
	
	public List<Author> getAllAuthors() throws SQLException {
		
		AuthorDAO ad = new AuthorDAO();
		List<Author> authors = ad.readAll();
		
		return authors;
	}
	
	public void editAuthor(Author author) throws SQLException {
		AuthorDAO ad = new AuthorDAO();
		ad.update(author);
	}

	public void addAuthor(Author author) throws SQLException {
		AuthorDAO ad = new AuthorDAO();
		ad.insert(author);
	}

	public void deleteAuthor(Author author) throws SQLException {
		AuthorDAO ad = new AuthorDAO();
		ad.delete(author);
	}
}
