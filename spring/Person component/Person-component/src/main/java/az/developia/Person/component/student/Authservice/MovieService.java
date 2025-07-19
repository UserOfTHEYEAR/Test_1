package az.developia.Person.component.student.Authservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import az.developia.Person.component.student.Repository.UserRepository;
import az.developia.Person.component.student.Request.dto.MovieRequestDto;
import az.developia.Person.component.student.movie.Movie;
import az.developia.Person.component.student.movie.MovieRepository;
import az.developia.Person.component.student.response.MovieResponse;
import az.developia.Person.component.student.user.User;

@Service
public class MovieService {

@Autowired
private MovieRepository movieRepository;

@Autowired
private UserRepository userRepository;

public void add(MovieRequestDto dto) {
String username = SecurityContextHolder.getContext().getAuthentication().getName();
User user = userRepository.getUserByUsername(username);
Integer id = user.getId();

Movie movie = new Movie();
movie.setId(null);
movie.setGenre(dto.getGenre());
movie.setRating(dto.getRating());
movie.setTitle(dto.getTitle());
movieRepository.save(movie);
}

public MovieResponse get() {
String username = SecurityContextHolder.getContext().getAuthentication().getName();
User user = userRepository.getUserByUsername(username);
Integer id = user.getId();

MovieResponse response = new MovieResponse();
response. setMovies(movieRepository.findByUserId());
return response;

}
}

