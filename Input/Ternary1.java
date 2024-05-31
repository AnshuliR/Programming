package Input;
import java.util.Scanner;

public class Ternary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(((n1>n2)?((n1>n3)?"First number is geatest.":"Third number is greatest."):((n2>n3)?"Second number is greatest":"Third number is greatest.")));
        sc.close();
    }
}
