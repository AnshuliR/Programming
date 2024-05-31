package Tasks;

import java.util.Scanner;

public class Elements {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            ar[i]= sc.nextInt();
        }

        //Printing the elements of first array
        System.out.println("Elements of first array:");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+", ");
            
        }
        System.out.println();

        //new array
        int ar2[] = new int[ar.length];
        for(int i =0;i<ar2.length; i++){
            ar2[i] = ar[i];
        }

        //Printing the elements of second array
        System.out.println("Elements of second array:");
        for(int i=0;i<ar2.length;i++){
            System.out.print(ar2[i]+", ");
        }
        sc.close();
    }
}
