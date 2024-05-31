package Tasks;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int s1 = sc.nextInt();
        int a[] = new int[s1];
        System.out.println("Enter the size of second array");
        int s2 = sc.nextInt();
        int b[] = new int[s2];

        //Inputs
        System.out.println("Enter the elements in first array");
        for(int i =0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the elements in second array");
        for(int i =0; i<b.length;i++){
            b[i] = sc.nextInt();
        }
        System.out.println();

        //Creating new array
        int c[] = new int[a.length+b.length];
        int k =0;
        for(int i = 0; i<c.length; i++){
            if(i<a.length){
                c[k++]=a[i];
            }
            if(i<b.length){
                c[k++]=b[i];
            }
        }

        //Displaying array of third array
        System.out.println("Elements of third array");
        for(int i :c){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
