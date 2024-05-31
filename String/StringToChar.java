package String;

import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        char ch[] = new char[s.length()];
        for(int i = 0; i<ch.length; i++){
            ch[i] = s.charAt(i);
        }
        System.out.println("Character Array:");
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
        sc.close();

    }
}
