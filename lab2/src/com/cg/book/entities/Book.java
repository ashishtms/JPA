package com.cg.book.entities;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_master")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "book_id")
	private int id;
	private String name;
	private int price;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
	private List<Author> authors = new ArrayList<>();

	public void addAuthor(Author authors) {
		this.getAuthors().add(authors);
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price
				+ ", authors=" + authors + "]";
	}
}
