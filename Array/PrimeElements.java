package Array;

import java.util.Scanner;

public class PrimeElements {
    public static boolean prime(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        boolean isPrime;
        System.out.println("Enter the elements in the array");
        for(int i=0; i<ar.length; i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("Prime numbers in the array are: ");
        for(int i=0; i<ar.length; i++){
            isPrime = prime(ar[i]);
            if(isPrime){
                System.out.println(ar[i]);
            }
            
        }
        sc.close();
    }
}
