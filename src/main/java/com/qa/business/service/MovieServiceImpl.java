package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.MovieRepository;

public class MovieServiceImpl implements MovieService {

	@Inject
	private MovieRepository repo;

	public String getAllMovies() {
		return repo.getAllMovies();
	}

	@Override
	public String addMovie(String movie) {
		if(movie.contains("Titanic")) {
			
			return "Can't Add This Movie";
		}
		return repo.createMovie(movie);
	}

	@Override
	public String deleteMovie(Long id) {
		return repo.deleteMovie(id);
	}

	public void setRepo(MovieRepository repo) {
		this.repo = repo;
	}

	@Override
	public int cycleMovies(String title) {

		return repo.cycleMovies(title);

	}

	@Override
	public String getAMovie(Long id) {
		return repo.getAMovie(id);
		
	}

	@Override
	public String updateMovie(String movie, Long id) {
		return repo.updateMovie(movie, id);
	}


}
