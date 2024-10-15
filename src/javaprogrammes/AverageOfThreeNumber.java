package javaprogrammes;

import java.util.Scanner;

public class AverageOfThreeNumber {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter three number
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // calculate the average
        double average = (num1 + num2 + num3 / 3);

        // print the average
        System.out.println("The average of the three number is: " + average);


    }

}
