package com.cg.book.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import com.cg.book.dao.BookDao;
import com.cg.book.dao.BookDaoImpl;
import com.cg.book.entities.Author;
import com.cg.book.entities.Book;

public class BookServiceImpl implements BookService {
	private BookDao dao;

	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}

	@Override
	public Author getAuthorById(int id) {
		// TODO Auto-generated method stub
		Author author = dao.getAuthorById(id);
		return author;
	}

	@Override
	public Book getBookById(int id) {
		Book book = dao.getBookById(id);
		return book;
	}

	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();

	}

	@Override
	public void addBook(Book book) {
		dao.beginTransaction();
		dao.addBook(book);
		dao.commitTransaction();

	}

	@Override
	public ArrayList<Book> getAuthorBooks(String author) {

		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getBooksInRange(int low, int high) {
	
		return dao.getBooksInRange(low, high);
	}

	public Set<Author> getBookAuthor(String author) {

		return dao.getBookAuthor(author);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}



}
