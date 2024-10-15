package javaprogrammes;

import java.util.Scanner;

public class BinaryNumber {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter two binary numbers
        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to decimal integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the two decimal integers
        int sum = num1 + num2;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        // Print the result
        System.out.println("Sum of two binary numbers: " + binarySum);

        // Close the scanner
        scanner.close();
    }
}
