import java.util.Scanner;

public class P12{
    public static boolean prime(int num){
        if(num<0||num==0||num==1)
            return false;
        else if(num==2)
            return true;
        else{
            int flag=0;
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                return true;
            else
                return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(prime(a[i]))
                System.out.print(a[i]+" ");
        }
        
    }
}