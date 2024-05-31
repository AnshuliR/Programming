package String;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        
        String ns = s.replaceAll(" ","");
     
        System.out.println("String without space: "+ns);
        sc.close();
    }
}
