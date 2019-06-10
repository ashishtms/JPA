package com.cg.authorjpa.dao;

import com.cg.authorjpa.entities.Author;


public interface AuthorDao {
	public abstract Author getAuthorById(int id);

	public abstract void addAuthor(Author author);

	public abstract void removeAuthor(Author author);

	public abstract void updateAuthor(Author author);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
	
}
