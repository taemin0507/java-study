package homework02;

import java.util.Scanner;

public class Homework08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.print("문자열 : ");
            String inputStr = sc.nextLine();

            System.out.print("문자 : ");
            String inputChar = sc.nextLine();

            if (inputChar.length() != 1) {
                System.out.println("한 개의 문자만 입력해주세요.");
                continue; 
            }

            char ch = inputChar.charAt(0); 
            int count = 0;

            for (int i = 0; i < inputStr.length(); i++) {
                if (inputStr.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println("포함된 개수 : " + count);
           
            while (true) {
                System.out.print("다시 입력하시겠습니까? : ");
                String answer = sc.nextLine();

                if (answer.equals("N")||answer.equals("n")) {
                    sc.close();
                    return; 
                } else if (answer.equals("Y")||answer.equals("y")) {
                    break; 
                } else {
                    System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
                }
            }
        }
        
        
    }
}
  