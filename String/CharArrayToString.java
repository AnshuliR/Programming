package String;

import java.util.Scanner;

public class CharArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        char c[] = new char[size];
        System.out.println("Enter the characters in the array");
        for(int i=0; i<c.length; i++){
            c[i]=sc.next().charAt(0);
        }
        String s = new String(c);
        System.out.println(s);
        sc.close();
    }
}
