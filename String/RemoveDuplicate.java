package String;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String ns = "";
        int count = 0;
        for(int i=0; i<s.length()-2; i++){
            char c = s.charAt(i);
            for(int j=i+1; j<s.length()-1; j++){
                char c1= s.charAt(j);
                if(c==c1){
                    c1 = s.charAt(j+1);
                    count++;
                }
            }
            if(count == 0){
                ns = ns+c;
            }
            else{
                
            }
            
        }
        System.out.println();
    }
}
