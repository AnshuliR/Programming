package Tasks;

import java.util.Scanner;

public class Prod{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int p=1;
        System.out.println("Enter the elements in the array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            p*=a[i];
        }
        System.out.println("The product is : "+p);
        sc.close();
    }
}