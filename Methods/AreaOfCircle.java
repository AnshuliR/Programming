package Methods;

import java.util.Scanner;

public class AreaOfCircle {
    public static double areaOfCircle(double r){
        double area = (22/7.0)*r*r;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        System.out.println("Area of the circle = "+areaOfCircle(r));
        sc.close();
    }
}
