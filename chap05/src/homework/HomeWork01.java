package homework;

public class HomeWork01 {

	public static void main(String[] args) {
		int[] x = {152, 180, 165, 158, 171};
		int temp;

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ", ");
		    for (int j = 0; j < x.length - 1; j++) {
		        if (x[j] > x[j + 1]) {
		            temp = x[j];
		            x[j] = x[j + 1];
		            x[j + 1] = temp;
		        }
		    }
		    
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
