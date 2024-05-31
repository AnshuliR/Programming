package Input;
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the attendance");
        int a = sc.nextInt();
        if (a>=75){
            System.out.println("Candidate is allowed for exam.");
        }
        else{
            System.out.println("Candidate is not allowed for exam.");
        }
        sc.close();
    }
}
