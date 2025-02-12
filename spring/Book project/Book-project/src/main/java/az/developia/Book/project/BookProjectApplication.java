package az.developia.Book.project;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.Book.project.entity.Book;

@SpringBootApplication
public class BookProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext r = SpringApplication.run(BookProjectApplication.class, args);
		
		Book bean = r.getBean(Book.class);
		System.out.print(bean);
		
		String[] beanDefinitionNames = r.getBeanDefinitionNames();
		for (String names : beanDefinitionNames) {
		System.out.println(names);
	}

	}
	}
