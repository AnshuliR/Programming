package Number;
import java.util.Scanner;;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0, num = n,d=0;
        while(num!=0){
            d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        if(n==rev){
            System.out.println(n+" is a Palindrome Number.");
        }
        else{
            System.out.println(n+" is a not a Palindrome Number.");
        }
        sc.close();
    }
}
