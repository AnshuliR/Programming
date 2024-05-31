package Array;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println();
        System.out.println("Enter the elements in array");
        for(int i = 0; i<size; i++){
            ar[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum+=ar[i];
        }
        System.out.println("Summation of elements of array is: "+sum);
        sc.close();
    }
}
