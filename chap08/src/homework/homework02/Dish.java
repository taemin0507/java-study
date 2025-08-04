package homework.homework02;

public class Dish extends Menu{
	String ingredients;
	
	public Dish() {
	}
	public Dish(String name, int price, String ingredients) {
		super(name,price);
		this.ingredients = ingredients;
		
	}
	
	
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	@Override
	void cook() {
		toString();
		System.out.println("재료는" + ingredients + "입니다.");
	}
	
	
	
	
	
	
	
	
	
	
}
