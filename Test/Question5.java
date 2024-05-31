package Test;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int count=0, co=0;

        char ch[] = new char[c.length];
        for(int i=0;i<c.length;i++){
            ch[i]=c[i];
            for(int j=i; j<ch.length;j++){
                if(ch[i]==c[j]){
                    co++;
                }
            }
            if(co==1){
                for(int k=i; k<c.length;k++){
                    if(ch[i]==c[k]){
                        count++;
                    }
                }
                System.out.print(ch[i]+""+count+" ");
                count=0;
            }
            co=0;
            
        }
        sc.close();;
    }
}
