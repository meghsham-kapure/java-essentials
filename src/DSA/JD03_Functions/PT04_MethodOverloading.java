package DSA.JD03_Functions;

public class PT04_MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Using int version of addition() performing math addition and the result is " + addition(10, 20));
        System.out.println("Using String version of addition() performing String concatenation and the result is " + addition("Meghsham", "Kapure"));
    }

    /**
     * Method overloading in Java means defining multiple methods with the same name in the same class, but with different parameters.
     * It allows a method to perform similar operations in different ways, depending on the number or type of inputs.
     * Rules for Method Overloading:
     * To overload a method, you must change at least one of the following:
     * Number of parameters
     * Type of parameters
     * Order of parameters (if types are different)
     * Only Changing the return type is not enough for overloading, for it to work properly it must differentiate it parameters.
     */

    public static int addition(int value1, int value2) {
        return value1 + value2;
    }

    public static String addition(String value1, String value2) {
        return value1 + " " + value2;
    }
}
