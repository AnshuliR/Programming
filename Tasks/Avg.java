package Tasks;
import java.util.Scanner;

public class Avg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int sum=0;
        System.out.println("Enter the elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("The average is : "+sum/a.length);
        sc.close();
    }
}