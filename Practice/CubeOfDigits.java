package Practice;

import java.util.Scanner;

public class CubeOfDigits {
    
    //cube of digits in given number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int d=0;
        while(n!=0){
            d=n%10;
            int cube = d*d*d;
            n/=10;
            System.out.println("Cube of "+d+" = "+cube);
        }
        sc.close();
    }
}
