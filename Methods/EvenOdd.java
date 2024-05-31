package Methods;
import java.util.Scanner;

public class EvenOdd {
    

    public static void evenOdd(int n){
        if(n%2 == 0){
            System.out.println(n+" is an even number");
        }
        else{
            System.out.println(n+" is an odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        evenOdd(n);
        sc.close();



    }
}
