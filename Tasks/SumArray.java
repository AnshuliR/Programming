package Tasks;
import java.util.Scanner;

public class SumArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int sum=0;
        System.out.println("Enter the elements in array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("The sum is : "+sum);
        sc.close();
    }
}