package String;

import java.util.Scanner;

public class EvenAscii {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            if((int)c%2==0){
                count++;
            }
        }
        System.out.print("Number of character present with even ascii value in the string: "+count);
        sc.close();
    }
}
