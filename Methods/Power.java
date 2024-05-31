package Methods;

import java.util.Scanner;

public class Power {
    public static int power(int n1,int n2){
        int pow = 1;
        for(int i = 1; i<=n2; i++){
            pow = pow*n1;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1+" raised to the power "+n2+" = "+power(n1, n2));
        sc.close(); 
    }
}
