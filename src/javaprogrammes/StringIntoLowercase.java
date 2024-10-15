package javaprogrammes;

import java.util.Scanner;

public class StringIntoLowercase {

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);

        // enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Print the result
        System.out.println("Lowercase string: " + lowercaseString);

        // Close the scanner
        scanner.close();

    }
}
