import java.awt.*;
import java.util.LinkedList;

public interface Sortable {
    void sortByMovieName_A_Z(LinkedList<Movie> movies);
    void sortByMovieName_Z_A(LinkedList<Movie> movies);
    void sortByYear_As(LinkedList<Movie>movies);
    void sortByYear_Des(LinkedList<Movie>movies);
    void sortByDirector(LinkedList<Movie>movies);
}
