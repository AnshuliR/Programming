import java.util.Scanner;

public class P6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int p=1;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            if(i%2==0)
                p*=a[i];
        }
        System.out.println("The sum is : "+p);
        
    }
}