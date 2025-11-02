package DSA.JD01_JavaBasics;

public class PT02_OutputStatements {
    public static void main(String[] args) {

        // println() - prints the text and moves the cursor to the next line
        System.out.println("Hello Java !!!");

        /*
         * System is a built-in class in Java from the java.lang package.
         * out is a static field (of type PrintStream) in the System class, used to output data.
         * println() is a method of PrintStream that prints a line of text to the console.
         * Behind the scenes (BTS), it first prints the argument, then moves the cursor to the next line.
         */

        // Empty println() just moves the cursor to the next line (prints a blank line)
        System.out.println();

        // Example 1: println with a primitive variable (int)
        int somePrimitiveDataVariable = 1;
        // Converts int to String and prints it
        System.out.println(somePrimitiveDataVariable);

        // Example 2: println with a reference type (Object)
        Object someReferencedDataVariable = new String("Hellow");
        // Calls toString() on the object and prints the result
        System.out.println(someReferencedDataVariable);

        /*
         * print() method does not add a newline,
         * so the next output appears on the same line.
         */
        System.out.print("Some Text");
        System.out.print("Some More Text");
    }
}
