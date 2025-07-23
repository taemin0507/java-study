package homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] choices = {"가위", "바위", "보"};
		Random rand = new Random();
		
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while(true) {
			System.out.print("가위바위보 : ");
			String str = sc.nextLine();
			
			int index = rand.nextInt(choices.length);
			String random1 = choices[index];
			
			if(str.equals("가위")) {
				if(random1.equals("가위")) {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("비겼습니다.\n");
					draw++;
					
				}else if(random1.equals("바위")) {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("졌습니다 ㅠㅠ\n");
					lose++;
				}else {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("이겼습니다!\n");
					win++;
				}
			}else if(str.equals("바위")) {
				if(random1.equals("바위")) {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("비겼습니다.\n");
					draw++;
				}else if(random1.equals("보")) {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("졌습니다 ㅠㅠ\n");
					lose++;
				}else {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("이겼습니다!\n");
					win++;
				}
			}else if(str.equals("보")) {
				if(random1.equals("보")) {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("비겼습니다.\n");
					draw++;
				}else if(random1.equals("가위")) {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("졌습니다 ㅠㅠ\n");
					lose++;
				}else {
					System.out.println("컴퓨터 : " + random1);
					System.out.println("사용자 : " + str);
					System.out.println("이겼습니다!\n");
					win++;
				}
			}else if(str.equals("stop")) {
				int total = win + lose + draw;
				System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패 ");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.\n");
				
			}
			
		}
		
		
		
		
	}

}
