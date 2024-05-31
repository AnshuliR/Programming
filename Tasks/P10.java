import java.util.Scanner;

public class P10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Limit : ");
        size=sc.nextInt();
        int b[]=new int[size];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        int flag=0;
        if(a.length!=b.length){
            System.out.println("Not Identical");
        }
        else{
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i])
                {
                    flag=1;break;
                }
            }
            if(flag==1)
            System.out.println("Not Identical");
        else
            System.out.println("Identical");
        }
        
        
    }
}