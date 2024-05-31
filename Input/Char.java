package Input;
import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if(ch>= 'A' && ch<='Z' || ch>='a'&& ch<='z'){
            System.out.println("Character is an alphabet.");
        }
        else if (ch>='0' && ch<='9') {
            System.out.println("Character is a digit.");
        }
        else{
            System.out.println("Character is a special character.");
        }
        sc.close();
    }
}
