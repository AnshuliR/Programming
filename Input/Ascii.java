package Input;
import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        int asciivalue = (int)ch;
        System.out.println("Ascii value of "+ch+" is "+asciivalue);
        sc.close();
    }
}
