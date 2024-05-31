import java.util.Scanner;

public class P13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0,j=a.length-1;i<a.length/2;i++,j--){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}