package javaprogrammes;

import java.util.Scanner;

public class SwapTwoVariable {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Display the original values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the variables using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display the swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Close the scanner
        scanner.close();
    }
}
