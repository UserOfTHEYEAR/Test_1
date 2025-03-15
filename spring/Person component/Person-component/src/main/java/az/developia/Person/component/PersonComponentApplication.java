package az.developia.Person.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.Person.component.Computer.Computer;
import az.developia.Person.component.entity.Person;




@SpringBootApplication
public class PersonComponentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext r = SpringApplication.run(PersonComponentApplication.class, args);
		
	//	Person bean = r.getBean(Person.class);
	//	System.out.print(bean);
		
	//	String[] beanDefinitionNames = r.getBeanDefinitionNames();
	//	for (String names : beanDefinitionNames) {
	//	System.out.println(names);
		
		Computer bean = r.getBean("myComp1",Computer.class);
		
		System.out.println(bean.getRam());
	}

}
	
