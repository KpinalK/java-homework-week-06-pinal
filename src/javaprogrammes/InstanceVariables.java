package javaprogrammes;

public class InstanceVariables {

    // Declare two instance variable
    int number = 10; // number is instance variable
    String name = "Pinal"; // name is instance variable

    // Declare one instance method
    public void method1() {
        System.out.println(number);// Direct calling instance variable into instance method
        System.out.println(name); // Direct calling instance variable into instance method
    }

    // Declare the main method
    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables(); // Object created
        obj.method1(); // Call the instance method into the main method

    }
}
