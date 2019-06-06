package com.qa.persistence.domain;

import javax.persistence.Entity;

@Entity
public class SubMovie extends Movie{
	
	private String subAttribute;
	
	public SubMovie() {
		
	}
	
	public SubMovie(String subAttribute) {
		
		this.subAttribute = subAttribute;
		
	}
	

}
