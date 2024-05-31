package Number;

import java.util.Scanner;

public class PerfectNumber {
    public static int factors(int n) {
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int sum = factors(n);
        if(sum==n){
            System.out.println(n+" is a Perfect Number");
        }
        else{
            System.out.println(n+" is not a Perfect Number");
        }
        sc.close();
    }
}
