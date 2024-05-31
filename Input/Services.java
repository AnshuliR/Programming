package Input;
import java.util.Scanner;

public class Services {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of service");
        int s = sc.nextInt();
        if(s>5){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
        sc.close();
    }
}
