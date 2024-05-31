import java.util.Scanner;

public class P109{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int j,flag=0,ctr=1;
            for(int i=0;i<a.length;i++)
            {
                for(j=i;j<a.length;j++){
                    ctr=j;
                    if(a[i]==a[j]&&i!=j){
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==1)
                System.out.println(ctr);
        }
    }