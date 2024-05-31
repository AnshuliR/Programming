package Input;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and a name and age and location");
        int n = sc.nextInt();
        String s = sc.nextLine();
        s = sc.nextLine();
        int a = sc.nextInt();
        String l = sc.nextLine();
        l = sc.nextLine();
        System.out.println(n);
        System.out.println(s);
        System.out.println(a);
        System.out.println(l);

        sc.close();
    }
}
