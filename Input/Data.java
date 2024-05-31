package Input;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        if (length == breadth){
            System.out.println("It is a square.");
        }
        else{
            System.out.println("It is a rectangle.");
        }
        sc.close();
    }
}
