# Java Strings

- String is sequence of character, in java they are used to store textual data with the help of 'String' class by Java.
- Creation of a string can be done with
    1. String literal : Any character or characters enclosed with double quotes are considered as String Literal
       e.g.`String str = "SomeText"`
    2. Using String constructor : We also can provide a String value to String class constructor and create object using
       `new` keyword.
       e.g.`new String("SomeText3")`
- Although both considered as String only but internal they are very much different and internal working of both the
  strings is different.

## Java String Immutability

### Why Strings are Immutable

* In Java, a String is an object.
* An object can be referenced by multiple variables.
* If Strings were mutable (changeable), then changing the String using one variable would also change it for all other
  variables pointing to the same object.
* This could cause unexpected behavior and even security risks (for example, when Strings are used to store passwords,
  database URLs, or file paths).

To avoid this problem, Java Strings are made immutable.

* Immutable means: once a String object is created, its value cannot be changed.
* If you try to modify it, Java creates a new String object and gives that new reference to the variable. The old object
  stays the same.

### Example

```java
public class StringImmutableExample {
    static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;
        // Both str1 and str2 point to the same "Hello" object

        // Trying to change str1
        str1 = str1 + " World"; // A NEW object "Hello World" is created

        System.out.println(str1); // Output: Hello World
        System.out.println(str2); // Output: Hello
    }
}
```

* This proves Strings are immutable — the original object never changed.
* If Strings were mutable, `str2` would also have changed to `"Hello World"`, which could be very dangerous in real
  programs.

### How Immutable Strings are managed with the String Pool

When you create a String in Java, the String Constant Pool (SCP) comes into play.

#### What is the String Pool?

* The String Pool is a special memory region inside the heap, reserved only for storing String literals.
* Strings stored in the pool act like constants: once created, they cannot be changed (immutability).

#### How it Works with Literals

* When you create a String literal, Java first checks if that value already exists in the pool.

    * If it exists → Java returns the reference to the already stored String.
    * If it doesn’t exist → Java creates a new String in the pool and returns its reference.
* This mechanism saves memory by avoiding duplicate String objects.

Example with Literals:

```java
public class StringPoolExample {
    static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2); // true (both point to the same object in the pool)
    }
}
```

#### Using `new` Keyword

* When you use the `new` keyword, Java always creates a new String object in the heap, even if the same value already
  exists in the pool.
* That means it does not reuse existing objects from the pool automatically.

Example with `new`:

```java
public class NewStringExample {
    static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // false (different objects in the heap)
        System.out.println(s1.equals(s2)); // tru
```

#### The `intern()` Method

* The `intern()` method is a way to manually add a String from the heap into the pool.
* If the pool already contains an equal String, `intern()` returns the reference from the pool.
* If not, it adds the String to the pool and then returns its reference.

Example with `intern()`:

```java
public class InternExample {
    static void main(String[] args) {
        String heapStr = new String("Hello");
        String poolStr = heapStr.intern();  // moves/links it to SCP

        String literalStr = "Hello";

        System.out.println(heapStr == literalStr); // false (heap vs pool)
        System.out.println(poolStr == literalStr); // true (both in the p
```

### Equality of Strings

* In Java, the `equals()` method is originally defined in the `Object` class.
* By default, `equals()` in `Object` behaves just like `==`, meaning it compares memory addresses (references).
* If two reference variables point to the same object in memory, it returns `true`; otherwise, it returns `false`.

However, in the `String` class, the `equals()` method is overridden.

* Instead of checking memory addresses, it compares the actual content (sequence of characters) of the Strings.
* If the characters match, it returns `true`; otherwise, it returns `false`.

👉 Example:

```java
public class StringEquality {
    static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2);        // false (different objects in memory)
        System.out.println(s1.equals(s2));   // true (conten
```

### calling `.toString()`

#### What happens when you call `System.out.println(someValue)`?

1. `println()` needs a String to print.
   But we often pass in all sorts of things: ints, doubles, objects, etc.

2. Java converts the given value into a String before printing.
   This is done by calling `String.valueOf()` internally.

3. `String.valueOf()` has many overloaded versions:

    * `valueOf(int i)`
    * `valueOf(double d)`
    * `valueOf(boolean b)`
    * `valueOf(char c)`
    * `valueOf(Object obj)`

4. For primitive types → `valueOf()` directly converts them into String (e.g., number → characters of that number).

5. For objects → `valueOf(Object obj)` is called.

    * If the object is `null`, it returns `"null"`.
    * Otherwise, it calls the object’s `.toString()` method.

### Example

```java
public class PrintlnExample {
    static void main(String[] args) {
        int x = 42;
        String str = "Hello";
        Object obj = new Object();

        System.out.println(x);     // calls String.valueOf(int)
        System.out.println(str);   // calls String.valueOf(Object) → returns "Hello"
        System.out.println(obj);   // calls String.valueOf(Object) → obj.toString()
    }
}
```

### Special Case with Objects

Suppose you pass a custom object:

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

public class Demo {
    static void main(String[] args) {
        Person p = new Person("John Doe");
        System.out.println(p);
    }
}
```

Output:

```
Person: John Doe
```

Why?

* `println(p)` → calls `String.valueOf(p)`.
* Since `p` is not null → `p.toString()` is called.
* That prints the custom string representation we defined in `toString()`.

### Java Strings, Primitives, and Text Manipulation

* Printing Primitives:
  When primitives are printed in Java, `String.valueOf()` and `toString()` are called internally.

* Wrapper Classes:
  Primitives can be converted into wrapper classes using `new ClassName(...)`, but this is deprecated. Instead, use
  autoboxing.

* Concatenation Rules:

    * Two objects cannot be concatenated directly. Both must be converted to Strings, usually via `.toString()`.
    * The `+` operator behaves differently with Strings — it performs concatenation instead of arithmetic.
    * Operator overloading is prohibited in Java, but the `+` operator for Strings is a built-in exception handled by
      the compiler.
    * While concatenating, any non-String object is automatically converted to a String using `.toString()`.

Example:

```java
int x = 10;
String result = "Value: " + x;  // x is automatically converted to String
```

* Garbage Collection:

    * An object becomes eligible for garbage collection when no live reference points to it.
    * The Java Garbage Collector (GC) automatically reclaims memory for such objects.

Example:

```java
String str = "Hello";
str =null; // The "Hello" object now has no references → eligible for GC
```

* String Immutability and Performance:

    * Strings in Java are immutable, meaning any modification (like concatenation) creates a new object.
    * Continuous modifications can cause poor performance and higher memory usage.
    * Strings are secure, but not ideal for heavy text manipulation.

* Efficient Alternatives:
  Java provides `StringBuffer` and `StringBuilder` for mutable text operations:

    * They allow modifications without creating new objects each time.
    * Useful methods include: `append()`, `insert()`, `delete()`, `reverse()`.

# Java printing

this can be done using `print`, `println`, and `printf`. They look similar but are subtly different in behavior and
power.

### 1. `print()`

* Prints the text/value you pass.
* Does not add a new line after printing.

Example:

```java
System.out.print("Hello");
System.out.

print(" World");
```

Output:

```
Hello World
```

Notice both texts are on the same line because no newline is added.

### 2. `println()`

* Prints the text/value you pass.
* Then adds a new line (`\n`) automatically.

Example:

```java
System.out.println("Hello");
System.out.

println("World");
```

Output:

```
Hello
World
```

So it’s just like `print()`, but with a newline after each call.

### 3. `printf()`

* Stands for “print formatted”.
* Gives you control to format output using format specifiers (similar to C’s `printf`).
* Does not add a new line unless you explicitly include `\n`.

Format specifiers examples:

* `%d` → integer
* `%f` → floating-point number
* `%s` → string
* `%n` → new line (platform-independent way instead of `\n`)

### Important Placeholders in Java

### For Numbers

* `%d` → decimal integer (base 10)

  ```java
  System.out.printf("Age: %d%n", 25);  // Age: 25
  ```
* `%o` → octal integer (base 8)

  ```java
  System.out.printf("%o%n", 25);  // 31
  ```
* `%x` / `%X` → hexadecimal integer (lower/upper case)

  ```java
  System.out.printf("%x%n", 255);  // ff
  System.out.printf("%X%n", 255);  // FF
  ```
* `%f` → floating-point (default 6 digits after decimal)

  ```java
  System.out.printf("%.2f%n", 3.14159);  // 3.14
  ```
* `%e` / `%E` → scientific notation (exponential)

  ```java
  System.out.printf("%e%n", 12345.6789); // 1.234568e+04
  ```
* `%g` / `%G` → automatically chooses normal or scientific notation.

### For Characters and Strings

* `%c` → single character

  ```java
  System.out.printf("%c%n", 'A');  // A
  ```
* `%s` → string

  ```java
  System.out.printf("%s%n", "Hello");  // Hello
  ```

### For Booleans

* `%b` / `%B` → boolean values (`true/false`)

  ```java
  System.out.printf("%b%n", 5 > 2);  // true
  ```

### For Special Values

* `%n` → newline (OS-independent, better than `\n`)
* `%%` → prints a literal `%`

  ```java
  System.out.printf("Success rate: 100%%%n"); // Success rate: 100%
  ```

### Width, Precision, and Alignment

* `%5d` → integer with width 5 (right aligned by default)

  ```java
  System.out.printf("%5d%n", 42);   // "   42"
  ```
* `%-5d` → integer with width 5, left aligned

  ```java
  System.out.printf("%-5d%n", 42);  // "42   "
  ```
* `%07d` → integer padded with leading zeros

  ```java
  System.out.printf("%07d%n", 42);  // "0000042"
  ```
* `%.2f` → float with 2 digits after decimal

  ```java
  System.out.printf("%.2f%n", 3.14159); // 3.14
  ```
* `%10.2f` → float with width 10, 2 decimals

  ```java
  System.out.printf("%10.2f%n", 3.14159); // "      3.14"
  ```

In Most Common in Practice:

* `%d`, `%f`, `%s`, `%n`, `%c`, `%b`, `%%`
* Plus modifiers: `width`, `precision`, `-` (left-align), `0` (zero padding).
