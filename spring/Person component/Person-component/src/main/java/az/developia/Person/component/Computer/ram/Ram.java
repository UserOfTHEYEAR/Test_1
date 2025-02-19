package az.developia.Person.component.Computer.ram;

import org.springframework.stereotype.Component;

public class Ram {
	@Component(value = "ComputerRam")
	public class Computer {

	private Integer id;
	private String Brand;
	private Integer RamAmount;
	private Integer Price;


	public Computer() {
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
	
	
}
	}
