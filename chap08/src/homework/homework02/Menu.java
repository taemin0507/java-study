package homework.homework02;



public abstract class Menu {
	public String name;
	public int price;
	
	protected Menu() {
		
	}
	protected Menu(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "메뉴명은 " + name + "이고, 가격은 " + price + "원입니다.";
	}	
	
	abstract void cook();
	
}
