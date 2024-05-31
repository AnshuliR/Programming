package String;

import java.util.Scanner;

public class CountLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int lowerCaseCount = 0;
        int specialCharCount = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }
            else if(!Character.isLetterOrDigit(ch)){
                specialCharCount++;
            }
        }
        System.out.println("Lowercase Character = "+lowerCaseCount);
        System.out.println("Special Character = "+specialCharCount);
        sc.close();
    }

}
