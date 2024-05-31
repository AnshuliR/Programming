package Tasks;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int asize = sc.nextInt();
        System.out.println("Enter the size of second array");
        int bsize = sc.nextInt();
        int a[]= new int[asize];
        int b[]= new int[bsize];
        System.out.println("Enter the elements of first array");
        for(int i = 0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for(int i = 0; i<b.length;i++){
            b[i]=sc.nextInt();
        }

        //Creating new merged array
        int c[]=new int[a.length+b.length];
        for(int i=0; i<a.length;i++){
            c[i]=a[i];
        }
        int j=0;
        for(int i=a.length;i<c.length;i++){
            c[i]=b[j];
            j++;
        }

        //Printing elements of merged array
        System.out.println("Elements of merged array");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        sc.close();
    }
}
