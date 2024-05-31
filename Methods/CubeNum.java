package Methods;

import java.util.Scanner;

public class CubeNum {
    public static int cubeNum(int n){
        int cube = n*n*n;
        return cube;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Cube of "+n+" = "+cubeNum(n));
        sc.close();
    }
}

