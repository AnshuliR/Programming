package Test;

import java.util.Scanner;

public class Question15 {
    public static boolean frontAgain(String str) {
        
        if (str.length() >= 2) {
           
            String firstTwo = str.substring(0, 2);
            
            String lastTwo = str.substring(str.length() - 2);
            
            return firstTwo.equals(lastTwo);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        boolean result = frontAgain(s);
        System.out.println("frontagain("+s+")" + result);
        sc.close();
    }
}
