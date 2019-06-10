package com.cg.book.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import com.cg.book.entities.Author;
import com.cg.book.entities.Book;

public interface BookService {
	public abstract Author getAuthorById(int id);

	public abstract Book getBookById(int id);

	public abstract void addAuthor(Author author);

	public abstract void addBook(Book book);

	public abstract List<Book> getAllBooks();

	public abstract ArrayList<Book> getAuthorBooks(String author);

	public abstract List<Book> getBooksInRange(int low, int high);

	public abstract Set<Author> getBookAuthor(String book);

}
