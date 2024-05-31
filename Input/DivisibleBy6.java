package Input;
import java.util.Scanner;

public class DivisibleBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%6 == 0){
            System.out.println(n+" is divisible by 6.");
        }
        sc.close();
    }
    
}
