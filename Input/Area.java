package Input;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth.");
        int len = sc.nextInt();
        int bre = sc.nextInt();
        int area = len * bre;
        System.out.println(area);
        sc.close();
    }
}
