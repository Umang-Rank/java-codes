package MovieVerseProject.service;

import java.util.List;
import java.util.Map;
import MovieVerseProject.model.Movie;
import MovieVerseProject.model.Snack;
import MovieVerseProject.model.User;

public interface BookMyShow {
	
	Movie bookTicket(List<Movie> mv);
	void printDetails(Map<Integer, List<?>> m);
	void logout();
	boolean login(User u);
	User signup();
	List<Snack> addMeal(List<Snack> sn);

}
