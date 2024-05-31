package Practice;
import java.util.Scanner;

public class SumOf {
    //sum of even digits in the number
    public static int sumOfEven(int n){
        int sum = 0, d;
        while(n!=0){
            d = n%10;
            if(d%2==0){
                sum+=d;
            }
            n/=10;

        }
        return sum;
    }

    //sum of odd digits in the number
    public static int sumOfOdd(int n){
        int sum = 0, d;
        while(n!=0){
            d = n%10;
            if(d%2!=0){
                sum+=d;
            }
            n/=10;
        }
        return sum;  
    }

    //sum of prime digits in the number
    public static int sumOfPrime(int n){
        int sum = 0, prime = 0, d;
        while(n!=0){
            d = n%10;
            for(int i =1; i<=d; i++){
                if(d%i==0){
                    prime++;
                }
            }
            if(prime==2){
                sum+=d;
            }
            prime = 0;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Sum of even digits in "+n+" = "+sumOfEven(n));
        System.out.println("Sum of odd digits in "+n+" = "+sumOfOdd(n));
        System.out.println("Sum of prime digits in "+n+" = "+sumOfPrime(n));

        sc.close();
    }
}
