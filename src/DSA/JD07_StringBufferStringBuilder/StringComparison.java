package DSA.JD07_StringBufferStringBuilder;

public class StringComparison {
    public static void main(String[] args) {
        String nameString1 = "John Snow";
        String nameString2 = "John Snow";

        // Compare using == which compares memory addresses of the objects
        System.out.println(nameString1 == nameString2); // => true
        // Both strings are created using string literals.
        // Since they are identical, only one object is created and stored in the String pool.

        // Compare using equals(), which compares the content of the strings
        System.out.println(nameString1.equals(nameString2)); // => true

        String nameString3 = new String("John Snow");
        String nameString4 = new String("John Snow");

        // Compare using == which compares memory addresses of the objects
        System.out.println(nameString3 == nameString4); // => false
        // Both strings are created using the 'new' keyword.
        // This creates two separate objects in the heap, even if their contents are identical.

        // Compare using equals(), which compares the content of the strings
        System.out.println(nameString3.equals(nameString4)); // => true
    }
}
