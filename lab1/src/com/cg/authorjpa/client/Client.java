package com.cg.authorjpa.client;


import com.cg.authorjpa.entities.Author;
import com.cg.authorjpa.service.AuthorServ;
import com.cg.authorjpa.service.AuthorServImpl;

public class Client {

	public static void main(String[] args) {
		
		AuthorServ service = new AuthorServImpl();
		
		Author author = new Author();
		author.setFirstName("Ashish");
		author.setMiddleName("I");
		author.setLastName("Jha");
		author.setPhoneNo("9768426053");
		service.addAuthor(author);
		
		//at this breakpoint, we have added one record to table
		author = service.getAuthorById(127);
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" First Name:"+author.getFirstName());
		System.out.println(" Middle Name:"+author.getMiddleName());
		System.out.println(" Last Name:"+author.getLastName());
		System.out.println(" Phone Number:"+author.getPhoneNo());
		
		author.setFirstName("Sachin");
		author.setMiddleName("Ramesh");
		author.setLastName("Tendulkar");
		author.setPhoneNo("Sachin Tendulkar");
		service.updateAuthor(author);
		
		//at this breakpoint, we have updated record added in first section
		author = service.getAuthorById(127);
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" Name:"+author.getFirstName());
		
		//at this breakpoint, record is removed from table
		service.removeAuthor(author);
		System.out.println("End of program...");
	
	}
}
