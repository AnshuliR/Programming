package Input;

import java.util.Scanner;

public class Age {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age of three people:");
    int a1 = sc.nextInt();
    int a2 = sc.nextInt();
    int a3 = sc.nextInt();
    if(a1 > a2){
        if (a1 > a3){
            System.out.println("Age of first person is greatest.");
        }
        else{
            System.out.println("Age of third person is greatest");
        }
    }
    else{
        if (a2 > a3) {
            System.out.println("Age of second person is greatest");
        }
        else{
            System.out.println("Age of third person is greatest");
        }
    }
    sc.close();
  }  
}