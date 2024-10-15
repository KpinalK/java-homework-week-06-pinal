package javaprogrammes;

public class OneInstanceOneStatic {

    // Declare one instance and one static variable
    int a = 15; // a is instance variable
    static byte b = 110; // b is a static variable

    // Declare one instance method
    public void m1() {
        System.out.println(a);// Direct calling instance variable into instance method
        System.out.println(OneInstanceOneStatic.b); // calling via class name
    }

    // Declare one static method
    public static void m2() {
        OneInstanceOneStatic obj = new OneInstanceOneStatic(); // Object created
        System.out.println(obj.a);// calling via object
        System.out.println(b); // Direct calling static variable into static method
    }

    // Declare the main method
    public static void main(String[] args) {
        // call both instance and static method into the main method
        OneInstanceOneStatic obj = new OneInstanceOneStatic();
        obj.m1();
        m2();


    }
}
