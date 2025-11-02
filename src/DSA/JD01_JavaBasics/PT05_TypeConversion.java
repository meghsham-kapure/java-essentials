package DSA.JD01_JavaBasics;

public class PT05_TypeConversion {

    public static void main(String[] args) {

        /*
         * Type Conversion in Java
         *
         * In Java, you can convert one data type to another. This is known as **Type Conversion**.
         * There are two types:
         *
         *  Implicit Type Conversion (Widening)
         *    - Done automatically by Java.
         *    - Converts a smaller type to a larger type (no data loss).
         *    - Example: int → long, float → double
         *    - Java performs automatic type promotion in expressions:
         *        → Smaller types are promoted to larger ones if needed.
         *        → Happens in mixed-type operations or assignments.
         *
         *  Explicit Type Conversion (Narrowing / Type Casting)
         *    - Done manually by the programmer using type casting.
         *    - Converts a larger type to a smaller type (data loss possible).
         *    - Example: double → int, long → byte
         *
         * General Rule:
         *    - If the destination type is larger → Java does it automatically.
         *    - If the destination type is smaller →  You must cast it manually.
         *
         *  Type Promotion Rules (during operations):
         *    - If operands have different types, the smaller type is promoted.
         *    - byte, short, and char → always promoted to int before operations.
         *    - If one operand is long, float, or double → result is promoted accordingly.
         *
         *  Special Cases: Overflow & Rounding
         *
         * 1. Overflow (Wrapping Around):
         *     - Happens when converting a large integer to a smaller type (e.g., int → byte).
         *     - Value wraps around within the smaller type’s range.
         *     - Example:
         *         int x = 130;
         *         byte b = (byte) x;  // Output: -126
         *
         *  2. Rounding (Truncation):
         *     - Happens when converting float/double to int.
         *     - Only the whole number part is kept.
         *     - Decimal part is discarded (not rounded).
         *     - Example:
         *         double d = 99.99;
         *         int i = (int) d;  // Output: 99
         */

        // ----------- Implicit Type Conversion Example -----------

        int intVal = 100;
        long longVal = intVal; // int is automatically converted to long
        double doubleVal = longVal; // long is automatically converted to double

        System.out.println("Implicit Type Conversion:");
        System.out.println("int value: " + intVal);
        System.out.println("Converted to long: " + longVal);
        System.out.println("Converted to double: " + doubleVal);
        System.out.println();

        // ----------- Explicit Type Conversion Example -----------

        double bigDouble = 99.99;
        int smallInt = (int) bigDouble; // double to int needs explicit casting

        System.out.println("Explicit Type Conversion:");
        System.out.println("double value: " + bigDouble);
        System.out.println("Converted to int (casted): " + smallInt); // 99 (decimal part lost)

        long bigLong = 100000L;
        byte smallByte = (byte) bigLong; // long to byte (overflow likely)

        System.out.println("long value: " + bigLong);
        System.out.println("Converted to byte (casted): " + smallByte); // Output may overflow
    }
}
