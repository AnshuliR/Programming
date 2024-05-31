package Number;
import java.util.Scanner;

public class OddFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in series.");
        int n = sc.nextInt();
        int s1=0,s2=1, s=0, count = 0;
        System.out.println("Fibonacci series: ");
        System.out.print(s1+", "+s2+", ");
        while (count<n-2) {
            s=s1+s2;
            if(s%2!=0){
                System.out.print(s+",");
                count++;
            }
            s1=s2;
            s2=s;
            
        }
        sc.close();

    }
}
