package javaprogrammes;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        // Convert the decimal number to binary
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Print the result
        System.out.println("Binary number is: " + binaryNumber);

        // Close the scanner
        scanner.close();

    }
}
