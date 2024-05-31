package Number;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in series.");
        int n = sc.nextInt();
        int s1=0,s2=1, s=0;
        System.out.println("Fibonacci series: ");
        System.out.print(s1+", "+s2+", ");
        for(int i=3; i<=n; i++){
            s=s1+s2;
            s1=s2;
            s2=s;
            System.out.print(s+", ");
        }
        

        sc.close();

    }
}
