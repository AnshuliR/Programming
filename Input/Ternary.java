package Input;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println(((n1>n2)?"First number is greater":"Second number is greater."));
        sc.close();
    }
}
