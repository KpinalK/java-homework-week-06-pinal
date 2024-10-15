package javaprogrammes;

public class StaticVariables {

    // Declare two static variables
    static int a = 25; // a is a static variable
    static String myName = "Devi"; // myName is a static variable

    // Declare one static method
    public static void method2() {
        System.out.println(a); // Direct calling static variable into static method
        System.out.println(myName); // Direct calling static variable into static method
    }

    // Declare the main method
    public static void main(String[] args) {
        method2(); // Direct calling static method into main method
    }
}
