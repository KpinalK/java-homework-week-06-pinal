package javaprogrammes;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create instance of the calculator class
        Calculator calculator = new Calculator();
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // call instance method
        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.subtract(num1, num2));

        //call static method
        System.out.println(Calculator.multiply(num1, num2));
        System.out.println(Calculator.divide(num1, num2));

        // close the scanner
        scanner.close();


    }

    // Instance method for addition
    public String add(int a, int b) {
        int answer = a + b;
        //Concatenation
        return "Addition of " + a + " and " + b + " is: " + answer;
    }

    // Instance method for subtraction
    public String subtract(int a, int b) {
        int answer = a - b;
        return "Subtraction of " + a + " and " + b + " is: " + answer;
    }

    // Static method for multiplication
    public static String multiply(int a, int b) {
        int answer = a * b;
        return "Multiplication of " + a + " and " + b + " is: " + answer;
    }

    // Static method for division
    public static String divide(int a, int b) {
        int answer = a / b;
        return "Division of " + a + " by " + b + " is: " + answer;
    }


}
