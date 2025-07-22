package homework;

public class HomeWork04 {

	public static void main(String[] args) {
		int[] x = new int[6];
		int temp = 0;
		
		for (int i = 0; i < x.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(x[j]==x[i]) {
					num = (int) (Math.random() * 45) + 1;
					j = -1;
				}
			}
			x[i] = num;
			System.out.println(x[i]);
		}
		
		
		
	}

}
