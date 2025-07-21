package homework02;

import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int sum = 0;

        while (true) {
            System.out.print("정수(1~50) : ");
            x = sc.nextInt();

            if (x >= 1 && x <= 50) {
                break; 
            } else {
                System.out.println("1~50 사이의 정수를 입력하세요.");
            }
        }

        for (int i = 2; i <= x; i += 2) {
            sum += i;
        }

        System.out.println("1부터 " + x + "까지의 짝수의 합: " + sum);
    }
}
