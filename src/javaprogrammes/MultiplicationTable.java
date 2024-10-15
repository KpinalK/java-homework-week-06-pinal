package javaprogrammes;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter a number for multiplication
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
