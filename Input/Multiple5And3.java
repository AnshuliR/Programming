package Input;
import java.util.Scanner;

public class Multiple5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println(n+" is multiple of 5 and 3.");
        }
        else{
            System.out.println(n+" is not a multiple of 5 and 3.");
        }
        sc.close();
    }
}
