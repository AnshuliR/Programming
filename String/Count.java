package String;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        int spChar = 0, vowel = 0, consonant = 0;
        String s = s1.toLowerCase();
        for(int i = 1; i<s.length(); i++){
            if(!(Character.isLetterOrDigit(s.charAt(i))) || (Character.isWhitespace(s.charAt(i)))){
                spChar++;
            }
            else if (Character.isLetter(s.charAt(i))){
                
                if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
            
        }
        System.out.println("Special characters: "+spChar);
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+consonant);
        sc.close();
    }
}
