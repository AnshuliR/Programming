package String;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String s1 = s+" ";
        String word="", nword="";
        int max_len = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)==' '){
                if(max_len<word.length()){
                    max_len=word.length();
                    nword = word;
                    
                }
                word = "";
            }
            else{
                word = word+s1.charAt(i);
            }
        }
        System.out.println("Longest word in String: "+nword);
        sc.close();
    }
}
