package Practice;

import java.util.Scanner;

public class DigitsFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int d=0;
        while(n!=0){
            int fact=1;
            d=n%10;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            System.out.println("Factorial of "+d+" = "+fact);
            n/=10;
        }
        sc.close();
    }
}
