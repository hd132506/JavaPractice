package org.dimigo.exception;

public class Movie {
	String title;
	int limitAge;

	public Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return limitAge
	 */
	public int getLimitAge() {
		return limitAge;
	}
	
	
	
	
}
