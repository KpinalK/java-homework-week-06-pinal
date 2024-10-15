package javaprogrammes;

import java.util.Scanner;

public class UpperCaseToLowerCase {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        //  enter a string
        System.out.print("Enter a string in uppercase: ");
        String upperCaseString = scanner.nextLine();

        // Convert the string to lowercase
        String lowerCaseString = upperCaseString.toLowerCase();

        // Display the result
        System.out.println("The string in lowercase is: " + lowerCaseString);

        // Close the scanner
        scanner.close();

    }
}
