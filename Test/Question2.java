package Test;

import java.util.Scanner;

public class Question2 {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static boolean strongNumber(int n){
        int n1=n;
        int sum=0, d=0, fact;
        while(n1!=0){
            d=n1%10;
            fact = factorial(d);
            sum+=fact;
            n1/=10;
        }
        if(sum==n){
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
        System.out.println("Enter the elements in the array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print("[");
        for(int i=0; i<ar.length;i++){
            boolean isStrongNumber = strongNumber(ar[i]);
            if(isStrongNumber){
                System.out.print(ar[i]+", ");
            }
        }
        System.out.print("]");
        sc.close();
    }
}
