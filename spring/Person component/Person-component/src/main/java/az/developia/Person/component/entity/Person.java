package az.developia.Person.component.entity;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	
		private Integer id;
		private String name;
		private Integer Age;
		private Integer sallery;
		
		//@Autowired
		//@Qualifier(value="myComp1")
		
		
		public Person() {
			this.id=1;
			this.name="Jake";
		    this.Age=42;
		    this.sallery=50000;
			
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return Age;
		}

		public void setAge(Integer age) {
			Age = age;
		}

		public Integer getSallery() {
			return sallery;
		}

		public void setSallery(Integer sallery) {
			this.sallery = sallery;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", Age=" + Age + ", sallery=" + sallery + "]";
		}
		
		
}
