package com.qa.persistence.repository;

public interface MovieRepository {

	//C
	String createMovie(String movie);
	
	//R
	String getAllMovies();
	
	String getAMovie(Long id);
	
	//U
	String updateMovie(String movie, Long id);

	//D
	String deleteMovie(Long id);
	
	int cycleMovies(String title);

}