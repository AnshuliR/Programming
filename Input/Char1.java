package Input;
import java.util.Scanner;

public class Char1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Character is a Lowercase alphabet.");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Character is an Uppercase alphabet.");
        }
        else{
            System.out.println("Not an alphabet.");
        }
        sc.close();
    }
}
