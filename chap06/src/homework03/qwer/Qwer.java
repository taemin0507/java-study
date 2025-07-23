package homework03.qwer;

import homework03.asdf.Asdf; 

public class Qwer {
    public static void main(String[] args) {
        Asdf a = new Asdf(); 

        String result1 = a.str("Hello, ", "World!");
        System.out.println("결과1: " + result1);

        int result2 = a.ad(10, 5); 
        System.out.println("결과2: " + result2);

        int result3 = a.ad(2, 5); 
        System.out.println("결과3: " + result3);

        boolean result4 = a.str2("test", "test");
        System.out.println("결과4: " + result4);
    }
}
