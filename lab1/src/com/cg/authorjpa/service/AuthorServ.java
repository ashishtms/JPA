package com.cg.authorjpa.service;

import com.cg.authorjpa.entities.Author;

public interface AuthorServ {
	public abstract Author getAuthorById(int id);

	public abstract void addAuthor(Author author);

	public abstract void removeAuthor(Author author);

	public abstract void updateAuthor(Author author);

}
