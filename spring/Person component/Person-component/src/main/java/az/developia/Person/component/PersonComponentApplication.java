package az.developia.Person.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.Person.PersonComponent.entity.Person;


@SpringBootApplication
public class PersonComponentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext r = SpringApplication.run(PersonComponentApplication.class, args);
		
		Person bean = r.getBean(Person.class);
		System.out.print(bean);
		
		String[] beanDefinitionNames = r.getBeanDefinitionNames();
		for (String names : beanDefinitionNames) {
		System.out.println(names);
	}

}
