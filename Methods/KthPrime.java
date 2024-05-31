package Methods;

import java.util.Scanner;


public class KthPrime {


    public static boolean prime(int n){
        int prime = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                prime++;
            }
        }
        if(prime==2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int c = 0;
        for(int i=1; i<=100;i++){
            boolean res = prime(i);
            if(res){
                c++;
                if(c==k){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}

