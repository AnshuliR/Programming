package Methods;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static double circumferenceOfCircle(double r){
        double circumference = 2*(22/7.0)*r;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        System.out.println("Circumference of the circle: "+circumferenceOfCircle(r));
        sc.close();
    }
}
