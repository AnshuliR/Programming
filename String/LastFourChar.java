package String;

import java.util.Scanner;

public class LastFourChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        
        if(s.length()>=4){
            String ns = s.substring(s.length()-4);
            System.out.print("Last four characters of the given string: "+ns);
        }
        sc.close();
    }
}
