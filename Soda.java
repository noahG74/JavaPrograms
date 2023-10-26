package Exam1;

public class Soda {
	
	private String brand = null;
	private int price = 1;
	
	public Soda (String brand, int price) {
		
		if(brand == "Coca-Cola" || brand == "Pepsi")
			this.brand = brand;
		else
			this.brand = "Pepsi";
		
		if (price > 0)
			this.price = price;
		else
			this.price = 1;
	}
	
	public Soda() {
		this.brand = "Pepsi";
		this.price = 1;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	
	public void setBrand (String brand) {
		if(brand == "Coca-Cola" || brand == "Pepsi")
			this.brand = brand;
		else
			this.brand = "Pepsi";
	}
	public void setPrice (int price) {
		if (price > 0)
			this.price = price;
		else
			this.price = 1;
	}
	

}
