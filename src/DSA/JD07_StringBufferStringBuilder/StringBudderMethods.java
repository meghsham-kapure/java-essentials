package DSA.JD07_StringBufferStringBuilder;

public class StringBudderMethods {
    static void main() {
        method();
    }

    public static void method1() {
        String inputStr = "John Doe";
        String outputStr = inputStr;
    }

    public static void method2() {
        StringBuilder stringBuilder = new StringBuilder("John Doe");
        stringBuilder.append(1);
        System.out.println(stringBuilder);
        stringBuilder.append(1);
        System.out.println(stringBuilder);

    }

    public static void method3() {
        StringBuilder stringBuilder = new StringBuilder("John Doe");
//       appendCodePoint () Adds a single Unicode character to a string buffer.
        stringBuilder.appendCodePoint(36); // adding $
        System.out.println(stringBuilder);  //John Doe$
    }

    public static void method4() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        stringBuilder = new StringBuilder("John");
        System.out.println(stringBuilder.capacity());
        stringBuilder = new StringBuilder("John Doe");
        System.out.println(stringBuilder.capacity());
//        capacity() give the capacity of string builder
//        Rule: Initial capacity = 16 + length of provided string
    }

    public static void method5() {
        StringBuilder stringBuilder1 = new StringBuilder("John Doe");
        StringBuilder stringBuilder2 = new StringBuilder("John Doe");
        StringBuilder stringBuilder3 = new StringBuilder("John Peterson");
        StringBuilder stringBuilder4 = stringBuilder3;

        System.out.println(stringBuilder1.compareTo(stringBuilder2));
        System.out.println(stringBuilder3.compareTo(stringBuilder2));
        System.out.println(stringBuilder3.compareTo(stringBuilder4));

//        Rule: Stops at first different character and returns ASCII(first) - ASCII(second)
    }

    public static void method6() {
        StringBuilder stringBuilder = new StringBuilder("John Doe");
        stringBuilder.delete(2, 5); // deletes chat at start to end-1
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(2); //deletes at specific index
        System.out.println(stringBuilder);
    }

    public static void method7() {
        StringBuilder stringBuilder = new StringBuilder("John Doe");
        System.out.println(stringBuilder.indexOf("o"));
        System.out.println(stringBuilder.indexOf("Doe"));
    }

    public static void method8() {
        StringBuilder stringBuilder = new StringBuilder("John Doe ");
        stringBuilder.insert(5, "Michel ");
        System.out.println(stringBuilder);
        stringBuilder.insert(16, "Washington DC ", 0, 10);
        System.out.println(stringBuilder);
    }

    public static void method9() {
        StringBuilder stringBuilder = new StringBuilder("John Doe");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    public static void method10() {
        StringBuilder stringBuilder = new StringBuilder("John Doe");
        stringBuilder.replace(0, 3, "#");
        System.out.println(stringBuilder);
    }


    public static void method11() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.repeat("INDIA\t", 100);
        System.out.println(stringBuilder);
    }

    public static void method12() {
        System.out.println(new StringBuilder().isEmpty());
        System.out.println(new StringBuilder(" ").isEmpty());
        System.out.println(new StringBuilder("ABC").isEmpty());
    }

    public static void method13() {
        StringBuilder sb = new StringBuilder("Hello I am I here I");
        // Positions:        I=6, I=10, I=16

        System.out.println(sb.lastIndexOf("I"));        // 16 (last I in entire string)
        System.out.println(sb.lastIndexOf("I", 15));    // 10 (last I before position 15)
        System.out.println(sb.lastIndexOf("I", 8));     // 6  (last I before position 8)
    }


    public static void method() {
        StringBuilder stringBuilder = new StringBuilder("Hello I am I here I");
        System.out.println(stringBuilder.substring(10));
        System.out.println(stringBuilder.substring(10, 12));


    }
//    public static void method(){}
//    public static void method(){}
//    public static void method(){}

}