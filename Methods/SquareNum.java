package Methods;

import java.util.Scanner;

public class SquareNum {
    public static int squareNum(int n){
        int sq = n*n;
        return sq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Square of "+n+" = "+squareNum(n));
        sc.close();
    }
}
