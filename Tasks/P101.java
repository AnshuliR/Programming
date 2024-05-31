import java.util.Scanner;

public class P101{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int b[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
                System.out.print(b[i]+" ");
        }
        
    }
}