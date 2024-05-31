package Tasks;

import java.util.Scanner;

public class RotationArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the number of rotations");
        int rot = sc.nextInt();

        System.out.println("Enter the elements");
        for(int i=0; i<a.length;i++){
            a[i] = sc.nextInt();
        }

        //Left Rotation
        // for(int i=1; i<=rot;i++){
        //     int k = a[0];
        //     for(int j=0;j<a.length-1;j++){
        //         a[j]=a[j+1];
        //     }
        //     a[a.length-1]=k;
        // }

        //Right rotation
        for(int i =1; i<=rot;i++){
            int k = a[a.length-1];
            for(int j=a.length-1;j>=1;j--){
                a[j]=a[j-1];
            }
            a[0]=k;
        }

        //Printing
        System.out.println("Elements after "+rot+"  rotations");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
