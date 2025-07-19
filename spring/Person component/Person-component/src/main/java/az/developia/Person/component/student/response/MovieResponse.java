package az.developia.Person.component.student.response;

import java.util.List;

import az.developia.Person.component.student.movie.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {
private List<Movie> movies;
}


