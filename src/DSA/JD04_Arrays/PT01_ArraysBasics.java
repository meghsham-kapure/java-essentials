package DSA.JD04_Arrays;

public class PT01_ArraysBasics {
    public static void main(String[] args) {

    }
}


/*
 * Arrays are a collection of values of the same data type, stored using a single variable name.
 *
 * Syntax:
 *   - Creating an array using the 'new' keyword:
 *       DataType[] arrayName = new DataType[lengthOfArrayElements];
 *
 *   - Creating an array with predefined values:
 *       DataType[] arrayName = { value1, value2, value3, ... };
 *
 *   - Declaring an array and initializing it later:
 *       DataType[] arrayName; // Declaration only (reference is created in the stack)
 *       // ...some code...
 *       arrayName = new DataType[length]; // Initialization (memory is allocated in the heap at runtime)
 *
 * When an array is created without specifying values, Java fills the array with default values:
 *   - For primitive types: 0, 0.0, false, etc., depending on the type
 *   - For reference types: null (meaning the element doesn't point to any object in memory)
 *
 * Unlike lower-level languages like C or C++, Java does not guarantee that array elements
 * are stored in contiguous memory. The Java Language Specification abstracts away such
 * memory layout details, leaving them up to the JVM implementation. While many JVMs do
 * use contiguous memory layouts for performance reasons, this is not guaranteed by the language itself.
 *
 * To access or modify elements in an array, use the index (starting from 0 to length - 1):
 *   arrayName[0] = someValue;
 *   int x = arrayName[1];
 */
