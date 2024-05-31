package Practice;

import java.util.Scanner;

public class StartingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int n = num;
        int d = 0;
        while(num!=0){
            d=num%10;
            num/=10;
        }
        if(d%2==0){
            System.out.println(n+" starts with even digit.");
        }
        else{
            System.out.println(n+" starts with odd digit.");
        }
        sc.close();
    }
}
