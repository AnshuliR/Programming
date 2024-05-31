package Practice;
import java.util.Scanner;

public class DuckNumber {
    //to check for duck number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int d = 0, c = 0;
        while(n!=0){
            d=n%10;
            if(d==0){
                c++;
            }
            n/=10;
        }
        if(c>0){
            System.out.println("It is a duck number.");
        }
        else{
            System.out.println("It is not a duck number.");
        }
        sc.close();
    }
}
