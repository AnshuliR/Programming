package Input;
import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println((n>0)?"Number is positive.":"Number is negative.");
        sc.close();
    }
}
