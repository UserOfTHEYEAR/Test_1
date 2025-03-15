package az.developia.Person.component.Computer.ram;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component(value = "ComputerRam")

public class Ram {
	


	private Integer id;
	private String Brand;
	private Integer RamAmount;
	private Integer Price;


	public Ram() {
	this.id=1;
	this.Brand="DDR5";
	this.RamAmount=16;
	this.Price=200;
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


	public Integer getRamAmount() {
		return RamAmount;
	}


	public void setRamAmount(Integer ramAmount) {
		RamAmount = ramAmount;
	}


	public Integer getPrice() {
		return Price;
	}


	public void setPrice(Integer price) {
		Price = price;
	}


	@Override
	public String toString() {
		return "Computer [id=" + id + ", Brand=" + Brand + ", RamAmount=" + RamAmount + ", Price=" + Price + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("init method is working");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method is working");
	}
	
}
	
