package Test;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        for(int i=1; i<=rows;i++){
            for(int sp=1;sp<i;sp++){
                System.out.print(" ");
            }
            for(int j=rows; j>=i;j--){
                if(i==1){
                    System.out.print("* ");
                }
                else if(j==rows || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //belowpo
        for(int i=2;i<=rows;i++){
            for(int sp=1;sp<=(rows-i);sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==rows){
                    System.out.print("* ");
                }
                else if(j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
