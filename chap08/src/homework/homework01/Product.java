package homework.homework01;

public abstract class Product {
	public String name;
	public int price;
	
	public Product() {
		
	}
	
	public Product(String name,int price) {
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int calculatePrice() {
		return (int)(price -(price * 0.1)) ;
	}
}
