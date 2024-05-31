package Input;
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        int s = sc.nextInt();
        int peri = 4*s;
        System.out.println(peri);
        sc.close();
    }
    
}
