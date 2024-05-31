package Tasks;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        //Reversing the array
        int j =ar.length-1;
        int rev[] = new int[ar.length];
        for(int i=0; i<rev.length;i++){
            rev[i]=ar[j];
            j--;
        }

        //Displaying the elements of array
        System.out.println("Elements of the array");
        for(int i=0; i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        //Displaying the elements of reversed array
        System.out.println("Elements of reversed array");
        for(int i =0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
        System.out.println();


        //Another method
        System.out.println("Enter the elements");
        int ar2[]= new int[size];
        for(int i=0;i<ar2.length;i++){
            ar2[i]=sc.nextInt();
        }
        //Reversing the array
        int start = 0, end = ar2.length-1;
        
        while(start<=end){
            int temp = ar2[start];
            ar2[start]=ar2[end];
            ar2[end]=temp;
            start++;
            end--;
        }

        //Displaying the reversed array
        System.out.println("Elements in Reversed array");
        for(int i = 0; i<ar2.length;i++){
            System.out.print(ar2[i]+" ");
        }
        sc.close();
    }
}
