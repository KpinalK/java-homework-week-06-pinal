package javaprogrammes;

public class TwoInstanceTwoStatic {
    // Declare two instance and two static variable

    int a = 100; //a is a instance variable
    String name = "Hello Good Morning"; // name is a instance variable
    static int b = 200; // b is a static variable
    static String myName = "World"; // myName is a static variable

    // Declare one instance method
    public void method1() {
        System.out.println(a); // Direct calling instance variable into instance method
        System.out.println(name); // Direct calling instance variable into instance method
        System.out.println(TwoInstanceTwoStatic.b); // Calling via class
        System.out.println(TwoInstanceTwoStatic.myName); // calling via class

    }

    // Declare one static method
    public static void method2() {
        TwoInstanceTwoStatic test = new TwoInstanceTwoStatic(); // Object created
        System.out.println(test.a);
        System.out.println(test.name);
        System.out.println(b); // direct calling static variable into static method
        System.out.println(myName); // direct calling static variable into static method

    }

    // Declare the main method
    public static void main(String[] args) {
        // Call both instance and static method into main method
        TwoInstanceTwoStatic test = new TwoInstanceTwoStatic(); // object declaration
        System.out.println("Method 1 starts: ");
        test.method1();
        System.out.println("\n"); // line space
        System.out.println("Method 2 Starts: ");
        method2();

    }

}
