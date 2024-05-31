package Practice;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0, num = n,d=0;
        while(num!=0){
            d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        System.out.println("Reverse of "+n+" = "+rev);
        sc.close();
    }
}
