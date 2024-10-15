package javaprogrammes;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter temperature in fahrenheit
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // convert fahrenheit to celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // display the result
        System.out.println("Temperature in Celsius: " + celsius);

        // close the scanner
        scanner.close();
    }
}
