package String;

import java.util.Scanner;

public class LowercaseConverter {
    public static String lowercaseConverter(String s){
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i] = (char)(ch[i]+32);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String lowercase = lowercaseConverter(s);
        System.out.println("Lowercase: "+lowercase);
        sc.close();
    }
}
