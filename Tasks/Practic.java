package Array;

import java.util.Scanner;

/**
 * Practic
 */
public class Practic {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Enter the size
        System.out.print("enter the size : ");
        byte size = s.nextByte();
        // Creating array
        byte [] arr = new byte[size];
        // Store Element
      for(int i =0;i<arr.length;i++){
          System.out.print("Enter the value : " + "arr["+i+"]" + " : ");
          arr[i]= s.nextByte();
      }
         int sum=0;
         for(byte i =0;i<arr.length;i++)
             sum+=arr[i];
         System.out.println("sum : "+sum);

         int pro=1;
         for(byte i =0;i<arr.length;i++)
             pro*=arr[i];
         System.out.println("product : "+pro);
         
         System.out.println("avg : "+sum/size);
    }
}