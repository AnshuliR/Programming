package Test;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n1 = n;
        int d=0, cube = 0, sum=0;
        while(n1!=0){
            d = n1%10;
            cube = d*d*d;
            sum+=cube;
            n1/=10;
        }
        if(sum==n){
            System.out.println("Yes, "+n+" is an Armstrong number.");
        }
        else{
            System.out.println("No, "+n+" is not an Armstrong number.");
        }
        sc.close();
    }
}
