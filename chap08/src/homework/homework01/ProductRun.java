package homework.homework01;

public class ProductRun {

	public static void main(String[] args) {
		Product product = new Food("치킨",20000,3); 
		Product product2 = new Book("자바의 정석",15000); 
		
		
		System.out.println(product.name+"의 최종 가격 : "+product.calculatePrice());
		System.out.println(product2.name+"의 최종 가격 : "+product2.calculatePrice());
	}

}
