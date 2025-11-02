package DSA.JD01_JavaBasics;

/*
 * The class name must match the public class name.
 * A class name is written in PascalCase: every new word starts with a capital letter.
 * Only one public class is allowed per Java file, and the file name must match this class.
 * `public` is an access modifier that makes the class accessible from anywhere.
 * `class` is a keyword used to define a class.
 * Everything in Java must be inside a class.
 */
public class PT01_JavaProgramStructure {

    /*
     * `public` is an access modifier that allows the main() method to be called from anywhere.
     * `static` means the method belongs to the class and can be run without creating an object.
     * `void` means the method does not return any value.
     * `main` is the entry point of any Java application.
     * `String[] args` is an array of String arguments passed to the program from the command line.
     */
    public static void main(String[] args) {

        /*
         * `System` is a built-in class in Java from the `java.lang` package.
         * `out` is a static member of `System`, an instance of `PrintStream`, used to output data.
         * `println()` is a method of `PrintStream` that prints a line of text to the console.
         */
        System.out.println("Hello, Java!");
    }
}
