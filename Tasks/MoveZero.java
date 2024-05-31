package Tasks;

import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        //Inputs
        System.out.println("Enter the elements in array");
        for(int i =0; i<a.length;i++){
            a[i]=sc.nextInt();
        }

        //MoviNG Zero
        int b[] = new int[a.length];
        int k = 0;
        for(int i =0; i<b.length;i++){
            if(a[i]!=0){
                b[k++]=a[i];
            }
        }

        System.out.println("Elements of the array are:");
        for(int i:b){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
