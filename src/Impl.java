import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Impl implements Findable, Sortable {

    @Override
    public LinkedList<Movie> getAllMovies(LinkedList<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(LinkedList<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getName().equals(name)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByActorName(LinkedList<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Movie m : movies) {
            for (Cast c : m.getCast()) {
                if (c.getActorFullName().equals(name)) {
                    System.out.println(m);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(LinkedList<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        for (Movie m : movies) {
            if (m.getYear() == year) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByDirector(LinkedList<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getDirector().getName().equals(name)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByDescription(LinkedList<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String world = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getDescription().equals(world)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByRole(LinkedList<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.nextLine();
        for (Movie m : movies) {
            for (Cast c : m.getCast()) {
                if (c.getRole().equals(role)) {
                    System.out.println(m);
                }
            }
        }
    }

    @Override
    public void sortByMovieName_A_Z(LinkedList<Movie> movies) {
        LinkedList<Movie> movies1 = new LinkedList<>();
        Collections.sort(movies);
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    @Override
    public void sortByMovieName_Z_A(LinkedList<Movie> movies) {
        movies.sort(sortMovieByName_Z__A);
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    @Override
    public void sortByYear_As(LinkedList<Movie> movies) {
        movies.sort(sortByYear_Asc);
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    @Override
    public void sortByYear_Des(LinkedList<Movie> movies) {
        movies.sort(sortByYear_Desc);
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    @Override
    public void sortByDirector(LinkedList<Movie> movies) {
        movies.sort(sortByDirectorN);
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    public static Comparator<Movie> sortMovieByName_Z__A = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    public static Comparator<Movie> sortByDirectorN = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };

    public static Comparator<Movie> sortByYear_Asc = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };
    public static Comparator<Movie> sortByYear_Desc = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear() - o1.getYear();
        }
    };
}

