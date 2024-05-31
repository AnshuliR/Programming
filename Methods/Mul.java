package Methods;

import java.util.Scanner;

public class Mul {
    public static double mul(double n1,double n2){
        double mul = n1*n2;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println(mul(n1, n2));
        sc.close();
    }
    
}
