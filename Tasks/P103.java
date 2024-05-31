import java.util.Scanner;

public class P103{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter limit : ");
        size=sc.nextInt();
        int b[]=new int[size];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int[a.length+b.length];
        for(int i=0,j=0,k=0;i<a.length+b.length;i++){
            if(i%2==0)
            {
                c[i]=a[j];j++;
            }
            else{
                c[i]=b[k];k++;
            }
        }
        for(int i=0;i<a.length+b.length;i++){
            System.out.println(c[i]+" ");
        }
        
    }
}