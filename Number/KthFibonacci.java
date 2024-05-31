package Number;

import java.util.Scanner;

public class KthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int s1 = 0, s2 = 1, s=0;
        if(k==0){
            System.out.println("The "+k+"th term of the series is: "+s1);
        }
        else if(k==1){
            System.out.println("The "+k+"th term of the series is: "+s2);
        }
        else{
            for(int i = 2; i<=k; i++){
                s=s1+s2;
                s1=s2;
                s2=s;
            }
            System.out.println("The "+k+"th term of the series is: "+s);
        }
        sc.close();
    }
}
