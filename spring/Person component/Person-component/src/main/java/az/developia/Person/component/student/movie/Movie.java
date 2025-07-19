package az.developia.Person.component.student.movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import lombok.Setter;

@Entity
	@Table(name = "movies")
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String title;
	private String genre;
	private Integer rating;


	}

