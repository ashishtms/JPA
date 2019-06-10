package com.cg.book.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.book.entities.Author;
import com.cg.book.entities.Book;

public class BookDaoImpl implements BookDao {
	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Author getAuthorById(int id) {
		Author author = entityManager.find(Author.class, id);
		return author;
	}

	@Override
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	@Override
	public void addAuthor(Author author) {
		entityManager.persist(author);

	}

	@Override
	public void addBook(Book book) {
		entityManager.persist(book);

	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

	@Override
	public List<Book> getAllBooks() {
		String qStr = "SELECT book FROM Book book ";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		List<Book> bookList = query.getResultList();
		for (Book a : bookList) {
			System.out.println(a);
		}
		return bookList;

	}

	@Override
	public ArrayList<Book> getAuthorBooks(String author) {

		List<Book> returnbook= new ArrayList<Book>();
		 String qStr = "SELECT b from Books b";
		 TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		 
		 List<Book> books= query.getResultList();
		 
		 for (Book book : books) {
		  @SuppressWarnings("unchecked")
		Set<Author> author1 = (Set<Author>) book.getAuthors();
		  for (Author author2 : author1) {
		   if(author2.getName().equalsIgnoreCase(author))
		   {
		    returnbook.add(book);
		   }
		  }
		 }
		 return (ArrayList<Book>) returnbook;

	}

	@Override
	public List<Book> getBooksInRange(int low, int high) {
		String qStr = "SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		for (Book a : bookList) {
			System.out.println(a);
		}
		return bookList;

	}

	@Override
	public Set<Author> getBookAuthor(String book) {
		HashSet<Author> authors = new HashSet<Author>();
		String qStr = "SELECT book FROM Book book WHERE book.name=:pBook";
		TypedQuery<Book> query = entityManager
				.createQuery(qStr, Book.class);
		query.setParameter("pBook", book);
//		Book booka = query.getSingleResult();
		List<Book> books = query.getResultList();
		for (Book book1 : books) {
			for (Author author : book1.getAuthors()) {
				authors.add(author);
			}
		}
		for (Author a : authors) {
			System.out.println(a);
		}
		return authors;
	}



}
