
package homework02;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  int x;
		  
		  while(true) {
			  System.out.print("숫자 : ");
			  x= sc.nextInt();
			  
			  if (x < 0) {
				  System.out.println("양수만 입력해주세요.");
			  }else if (x > 9) {
				  System.out.println("9이하의 숫자를 입력해주세요");
			  }else if (x == 0) {
				  System.exit(0);
			  }
			  
			  
			  for ( int i = x; i <= 9; i++) {
				  System.out.println("=== " + i + "단 ===");
			  	for (int j = 1; j <=9; j++) {
				  
			  		System.out.println(i + " * " + j + " = " + i*j);
			  	}
			  }
			  
			 
		  }
		  
	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
