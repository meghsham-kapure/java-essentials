package DSA.JD07_StringBufferStringBuilder;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // strObj.length() : returns an integer value which is number of characters in string
        System.out.println("John Snow".length()); // ==> 9

        // strObj.charAt(int index)  : returns the character present at the specified index
        System.out.println("John Snow".charAt(5)); //  ==> 'S'

        // strObj.substring(int beginIndex) : returns a substring starting from beginIndex to end of string
        System.out.println("John Snow".substring(5)); // ==> "Snow"

        // strObj.substring(int beginIndex, int endIndex) : returns a substring from beginIndex (inclusive) to endIndex (exclusive)
        System.out.println("John Snow".substring(4, 9)); // ==> " Snow"

        // strObj1.equals(String strObj2) : checks if two strings have the same content (case-sensitive)
        System.out.println("John Snow".equals("John Snow")); // ==> true
        System.out.println("John Snow".equals("john snow")); // ==> false
        System.out.println("John Snow".equals("JohnSnow"));  // ==> false

        // strObj1.equalsIgnoreCase(String strObj2) : compares strings ignoring case differences
        System.out.println("John Snow".equalsIgnoreCase("John Snow")); // ==> true
        System.out.println("John Snow".equalsIgnoreCase("john snow")); // ==> true
        System.out.println("John Snow".equalsIgnoreCase("JohnSnow"));  // ==> false

        // strObj.contains(CharSequence s) : checks if the string contains the given sequence
        System.out.println("John Snow".contains("John"));  // ==> true
        System.out.println("John Snow".contains("Johny")); // ==> false

        // strObj.indexOf(String str) : returns index of first occurrence of substring/character, or -1 if not found
        System.out.println("John Snow".indexOf("Snow")); // ==> 5
        System.out.println("John Snow".indexOf('n'));    // ==> 3

        // strObj.lastIndexOf(String str) : returns index of last occurrence of substring/character, or -1 if not found
        System.out.println("John Snow".lastIndexOf("Snow")); // ==> 5
        System.out.println("John Snow".lastIndexOf('n'));    // ==> 6

        // strObj.toLowerCase() : returns a new string with all characters in lowercase
        System.out.println("John Snow".toLowerCase()); // ==> "john snow"

        // strObj.toUpperCase() : returns a new string with all characters in uppercase
        System.out.println("John Snow".toUpperCase()); // ==> "JOHN SNOW"

        // strObj.trim() : removes leading and trailing whitespace
        System.out.println("\tJohn Snow  ".trim()); // ==> "John Snow"

        // strObj.replace(CharSequence target, CharSequence replacement) : replaces all occurrences of target with replacement
        System.out.println("John Snow".replace("Snow", "Walker")); // ==> "John Walker"

        // strObj.split(String regex) : splits the string around matches of the given regex
        System.out.println(Arrays.toString("John Snow Walker".split(" "))); // ==> [John, Snow, Walker]

        // String.valueOf(...) : converts different data types (int, double, boolean, etc.) to their String representation
        String intInString = String.valueOf(123456);
        System.out.println(intInString.length()); // ==> 6
    }
}
