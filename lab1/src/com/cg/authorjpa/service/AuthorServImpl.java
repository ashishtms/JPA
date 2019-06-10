package com.cg.authorjpa.service;

import com.cg.authorjpa.dao.AuthorDao;
import com.cg.authorjpa.dao.AuthorDaoImpl;
import com.cg.authorjpa.entities.Author;


public class AuthorServImpl implements AuthorServ {
	private AuthorDao dao;
	
	public AuthorServImpl()
	{
		dao = new AuthorDaoImpl();
	}

	@Override
	public Author getAuthorById(int id) {
		// TODO Auto-generated method stub
		Author author = dao.getAuthorById(id);
		return author;
	}

	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();

	}

	@Override
	public void removeAuthor(Author author) {
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();

	}


}
