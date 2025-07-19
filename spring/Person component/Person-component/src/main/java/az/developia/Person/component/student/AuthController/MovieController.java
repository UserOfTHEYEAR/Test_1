package az.developia.Person.component.student.AuthController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import az.developia.Person.component.student.Authservice.MovieService;
import az.developia.Person.component.student.Request.dto.MovieRequestDto;

@RestController
@RequestMapping(path ="/movies")
@CrossOrigin(origins = "*")
public class MovieController {

@Autowired
private MovieService movieService;

@GetMapping
public String getMovie() {
return "get movie";

}

@PostMapping(path ="/add")
public void create(@RequestBody MovieRequestDto dto) {
movieService.add(dto);

}

}

