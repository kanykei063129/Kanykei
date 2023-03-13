import java.awt.*;
import java.util.LinkedList;

public interface Findable {
    LinkedList<Movie> getAllMovies(LinkedList<Movie>movies);
    void findMovieByName(LinkedList<Movie>movies);
    void findMovieByActorName(LinkedList<Movie>movies);
    void findMovieByYear(LinkedList<Movie>movies);
    void findMovieByDirector(LinkedList<Movie>movies);
    void findMovieByDescription(LinkedList<Movie>movies);
    void findMovieByRole(LinkedList<Movie>movies);


}
