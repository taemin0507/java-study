package homework;

import java.util.Scanner;


public class HomeWork06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;

        System.out.print("배열의 크기를 입력하세요 : ");
        count = sc.nextInt();
        sc.nextLine(); 

        String[] str = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 문자열 : ");
            str[i] = sc.nextLine();
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
            String yn = sc.nextLine();

            if (yn.equalsIgnoreCase("Y")) {
                System.out.print("더 입력하고 싶은 개수 : ");
                int more = sc.nextInt();
                sc.nextLine(); 

                String[] temp = new String[str.length + more];
                for (int i = 0; i < str.length; i++) {
                    temp[i] = str[i];
                }

                for (int i = str.length; i < temp.length; i++) {
                    System.out.print((i + 1) + "번째 문자열 : ");
                    temp[i] = sc.nextLine();
                }

                str = temp; 

            } else if (yn.equalsIgnoreCase("N")) {
                System.out.println("최종 문자열 배열 값:");
                for (int i = 0; i < str.length; i++) {
                    System.out.println(str[i]);
                }
                break;

            } else {
                System.out.println("입력할 수 없는 값입니다.");
            }
        }

        sc.close();
    }
}
