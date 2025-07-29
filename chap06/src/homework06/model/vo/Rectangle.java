package homework06.model.vo;

public class Rectangle {
	int width;
	int height;

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.height = 1;
		this.width = 1;
	}

	public int calculateRound() {
		return height * width + height * 2;
	}

	public int calculateArea() {
		return height * width * height;
	}
	public void printInfo() {
		System.out.println(calculateRound());
		System.out.println(calculateArea());
		
	}

}
