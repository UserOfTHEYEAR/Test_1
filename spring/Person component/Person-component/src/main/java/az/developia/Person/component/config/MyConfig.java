package az.developia.Person.component.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import az.developia.Person.component.entity.Person;

@Configuration
public class MyConfig {
	@Bean
	public Person myStudent1() {
	Person P=new Person();
	P.setId(1);
	P.setAge(45);
	P.setName("Bob");
	P.setSallery("Bayramov");
	return P;

	}

	@Bean
	@Primary
	public Computer myComp2() {
	Computer c=new Computer();
	c.setId(1);
	c.setModel("g65");
	return c;
}
