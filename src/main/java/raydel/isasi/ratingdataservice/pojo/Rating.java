package raydel.isasi.ratingdataservice.pojo;

public class Rating {
public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

private String movieId;

private int rating;

public String getMovieId() {
	return movieId;
}

public void setMovieId(String movieId) {
	this.movieId = movieId;
}

public int getRating() {
	return rating;
}

public Rating(String movieId, int rating) {
	super();
	this.movieId = movieId;
	this.rating = rating;
}

public void setRating(int rating) {
	this.rating = rating;
}
}
