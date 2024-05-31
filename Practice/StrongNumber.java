package Practice;

import java.util.Scanner;

public class StrongNumber {
    public static int factorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(n!=0){
            int d = n%10;
            sum = sum+factorial(d);
            n/=10;
        }
        if(num == sum){
            System.out.println(num+" is a Strong Number.");
        }
        else{
            System.err.println(num+" is not a Strong Number.");
        }
        sc.close();
    }
}
