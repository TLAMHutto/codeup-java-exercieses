package Shapes;

import java.util.Scanner;

public class CircleApp {
    //get user input for radius
    public static double getRadius() {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        return radius;
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        double radius = getRadius();
        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circum of the circle is: " + circle.getCircumference());
    }
}
