package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.MovieService;

@Path("/movie")
public class MovieEndpoint {
	
	@Inject
	private MovieService service;

	@Path("/getAllMovies")
	@GET
	@Produces({ "application/json" })
	public String getAllMovies() {
		return service.getAllMovies();
	}
	
	@Path("/cycleMovies/{title}")
	@GET
	@Produces({ "application/json" })
	public int cycleMovies(@PathParam("title") String title) {
		return service.cycleMovies(title);
	}
	
	@Path("/getAMovie/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAMovie(@PathParam("id") Long id) {
		return service.getAMovie(id);
	}

	@Path("/createMovie")
	@POST
	@Produces({ "application/json" })
	public String addMovie(String movie) {
		return service.addMovie(movie);
	}

	@Path("/deleteMovie/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteMovie(@PathParam("id") Long id) {
		return service.deleteMovie(id);
	}

	public void setService(MovieService service) {
		this.service = service;
	}

}
