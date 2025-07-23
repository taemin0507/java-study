package homework02;

public class Homework06 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // i = 1, 2, 3, 4, 5
			for (int k = 1; k <= 5-i; k++) { // 빈칸 = 4, 3, 2, 1, 0
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i-1); j++) { // * = 1, 3, 5, 7, 9
				System.out.print("*");
			}
			System.out.println();
		}
				
	}

}
