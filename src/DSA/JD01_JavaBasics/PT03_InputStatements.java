package DSA.JD01_JavaBasics;

import java.util.Scanner;

public class PT03_InputStatements {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        /*
         * `new` is a keyword used to create an object.
         * `Scanner` is a class used to take input from a source (like keyboard).
         * `System.in` is an InputStream connected to the keyboard.
         */

        // Input: int
        System.out.print("Enter an integer: ");
        int integerValue = sc.nextInt();
        System.out.println("integerValue is " + integerValue + " of type int");

        // Input: char
        System.out.print("Enter a single character: ");
        char charValue = sc.next().charAt(0);
        System.out.println("charValue is " + charValue + " of type char");

        // Input: boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = sc.nextBoolean();
        System.out.println("booleanValue is " + booleanValue + " of type boolean");

        // Input: double
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();
        System.out.println("doubleValue is " + doubleValue + " of type double");

        // Input: float
        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();
        System.out.println("floatValue is " + floatValue + " of type float");

        // Input: long
        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();
        System.out.println("longValue is " + longValue + " of type long");

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
