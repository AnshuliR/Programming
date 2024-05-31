package Input;
import java.util.Scanner;

public class PositveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = sc.nextInt();
        if(n>0){
            System.out.println(n+" is positive number.");
        }
        else if(n<0){
            System.out.println(n+" is a negative number.");
        }
        else{
            System.out.println("Number is 0.");
        }
        sc.close();
    }
}
