package com.qa.business.service;

public interface MovieService {

	//C
	String addMovie(String movie);
	
	//R
	String getAllMovies();
	
	String getAMovie(Long id);

	//U
	String updateMovie(String movie, Long id);

	//D
	String deleteMovie(Long id);
	
	int cycleMovies(String title);

}