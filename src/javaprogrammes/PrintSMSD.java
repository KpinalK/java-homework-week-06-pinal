package javaprogrammes;

import java.util.Scanner;

public class PrintSMSD {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter two numbers
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        // Perform calculations
        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        // Print the results
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " x " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
        System.out.println(firstNumber + " mod " + secondNumber + " = " + mod);

        // Close the scanner
        scanner.close();
    }
}
