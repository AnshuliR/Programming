package Input;
import java.util.Scanner;

public class Whole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal value");
        double d = sc.nextDouble();
        int num = (int)d;
        System.out.println("Whole value of "+d+ " is "+num);
        sc.close();
    }
}
