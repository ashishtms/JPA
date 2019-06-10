package com.cg.book.client;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import com.cg.book.entities.Author;
import com.cg.book.entities.Book;
import com.cg.book.service.BookService;
import com.cg.book.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BookService service = new BookServiceImpl();

		Book book = new Book();
		book.setId(1);
		book.setName("Pirsuit of Happiness");
		book.setPrice(450);
		service.addBook(book);
		System.out.println(book.toString());

		Book book1 = new Book();
		book1.setId(2);
		book1.setName("Steve Jobs");
		book1.setPrice(750);
		service.addBook(book1);

		Book book3 = new Book();
		book3.setId(3);
		book3.setName("Secret Mission");
		book3.setPrice(200);
		service.addBook(book3);

		Author first = new Author();
		first.setId(1005);
		first.setName("B.K. Ajnvu");
		first.addBook(book);
		first.addBook(book1);
		service.addAuthor(first);

		Author first1 = new Author();
		first1.setId(1006);
		first1.setName("M.K. Binav");

		first1.addBook(book3);
		first1.addBook(book1);
		service.addAuthor(first1);
		service.getAllBooks();

		int a=sc.nextInt();
		int b=sc.nextInt();
		service.getBooksInRange(a,b);
		System.out.println("Books by M.K. Binav");
		
		ArrayList<Book> books = service.getAuthorBooks("M.K. Binav");
		Set<Author> authors = service.getBookAuthor("Secret Mission");
		
		
			

		}

	}

