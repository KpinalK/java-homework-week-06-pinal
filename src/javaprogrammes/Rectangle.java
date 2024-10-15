package javaprogrammes;

public class Rectangle {

    public static void main(String[] args) {
        // define width and height
        double width = 5.6;
        double height = 8.5;

        // calculate the area
        double area = width * height;
        double answer = 47.60;

        // calculate perimeter
        double perimeter = 2 * (width + height);
        double ans = 28.20;

        // print the result
        System.out.println("Area is " + width + " * " + height + " = " + answer);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + ans);

    }
}
