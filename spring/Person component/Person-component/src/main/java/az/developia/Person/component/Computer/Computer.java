package az.developia.Person.component.Computer;

import org.springframework.stereotype.Component;

@Component(value = "myComp1")
	public class Computer {

	private Integer id;
	private String Brand;
	private Integer Price;
	private String color;

	public Computer() {
	this.id=1;
	this.Brand="Asus";
	this.Price=1800;
	this.color="White";
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public Integer getPrice() {
		return Price;
	}

	public void setPrice(Integer price) {
		Price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	}
