package javaprogrammes;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        // Scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter the radius value
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // calculate the area using the formula A = PI * r * r
        double area = Math.PI * radius * radius;

        //display the area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // close the scanner
        scanner.close();

    }
}
