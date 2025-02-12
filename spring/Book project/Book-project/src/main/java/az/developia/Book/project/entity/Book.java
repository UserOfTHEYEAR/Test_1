package az.developia.Book.project.entity;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private Integer id;
	private String name;
	private Integer price;
	private Integer pagecount;
	
	public Book() {
		this.id=1;
		this.name="the boy in the pyjamas";
	    this.price=55;
	    this.pagecount=198;
		
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getPagecount() {
		return pagecount;
	}

	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}


	
		@Override
		public String toString() {
			return "Book [id=" + id + ", name=" + name + ", price=" + price + ", pagecount=" + pagecount + "]";
		}

	
	
}



