package String;

import java.util.Scanner;

public class PalindromeString {

    public static boolean checkPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        boolean isPalindrome = checkPalindrome(s);
        if(isPalindrome){
            System.out.println(s+" is a Palindrome string.");
        }
        else{
            System.out.println(s+" is not a palindrome string.");
        }
        sc.close();
    }
}
