package TopFiveMovies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrendingMovies {
	public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
        		new Movie("Inception", 8.8, 2010),
        		new Movie("Interstellar", 8.7, 2014),
                new Movie("Jawan", 7.5, 2023),
                new Movie("Oppenheimer", 8.6, 2023),
                new Movie("Avatar 2", 7.8, 2022),
                new Movie("KGF 2", 8.4, 2022),
                new Movie("Pathaan", 6.8, 2023),
                new Movie("Dune Part 2", 8.9, 2024),
                new Movie("RRR", 8.0, 2022)
        );


        // 1. filter recent movies (after 2021)
        // 2. sort by rating (high to low), if rating same then latest year first
        // 3. take top 5

        List<Movie> topMovies = movies.stream().filter(m -> m.year >= 2022).sorted((m1, m2) -> {
                    if (m2.rating != m1.rating) {
                        return Double.compare(m2.rating, m1.rating);
                    } else {
                        return m2.year - m1.year;
                    }
                })
                .limit(5).collect(Collectors.toList());

        System.out.println("Top 5 Trending Movies:");
        topMovies.forEach(m -> System.out.println(m.name));
    }
}

