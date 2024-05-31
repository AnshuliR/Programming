package Test;
import java.util.Scanner;
public class Question7 {
    public static String sort(char[] c){
        for(int i = 0; i<c.length-1; i++){
            for(int j = i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        return new String(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        String s3 = sort(c1);
        String s4 = sort(c2);
        if(s3.equalsIgnoreCase(s4)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}
