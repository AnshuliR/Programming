package Input;
import java.util.Scanner;

public class MultipleOf8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%8==0){
            System.out.println(n+" is multiple of 8.");
        }
        else{
            System.out.println(n+" is not a multiple of 8.");
        }
        sc.close();
    }
}
