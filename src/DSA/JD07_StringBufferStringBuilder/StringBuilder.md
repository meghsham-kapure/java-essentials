# StringBuffer and StringBuilder in Java

### Why do we need them?

* Strings in Java are immutable — once created, they cannot be changed.
* Every modification (like concatenation) creates a new String object, leading to:

    * More memory usage.
    * Poor performance for heavy text operations (loops, repeated concatenations, etc.).

To solve this, Java provides mutable alternatives:

* `StringBuffer`
* `StringBuilder`

## StringBuffer

* A mutable class that allows modification of character sequences.
* Thread-safe: Multiple threads can work on a `StringBuffer` without causing data inconsistency.
* Synchronized: All its methods are synchronized, meaning only one thread can access it at a time.
* Because of synchronization, it’s slower than `StringBuilder`.

Example:

```java
public class BufferExample {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");   // modifies same object
        sb.insert(5, " Java"); // insert at index
        sb.replace(0, 5, "Hi"); // replace part of string
        sb.delete(3, 8);       // delete chars between index 3 and 8
        sb.reverse();          // reverse string
        System.out.println(sb);
    }
}
```

## StringBuilder

* Also a mutable class similar to `StringBuffer`.
* Not thread-safe: No synchronization → not safe when multiple threads access it.
* But because it avoids synchronization, it’s faster than `StringBuffer`.
* Best choice for single-threaded applications where performance is more important.

Example:

```java
public class BuilderExample {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        sb.delete(3, 8);
        sb.reverse();
        System.out.println(sb);
    }
}
```

## Common Methods in Both

Both `StringBuffer` and `StringBuilder` have the same API:

* `append(String str)` → Adds text at the end.
* `insert(int offset, String str)` → Inserts text at a given index.
* `replace(int start, int end, String str)` → Replaces text between two indexes.
* `delete(int start, int end)` → Removes text between two indexes.
* `reverse()` → Reverses the sequence.
* `capacity()` → Returns the current capacity (storage).
* `ensureCapacity(int minCapacity)` → Ensures space for given capacity without reallocation.
* `charAt(int index)` → Returns character at given index.
* `length()` → Returns the length of sequence.
* `substring(int start, int end)` → Extracts part of the sequence.

## Capacity and Performance

* Both start with a default capacity of 16 characters (plus the length of the string you give).
* When exceeded, capacity grows automatically as `(oldCapacity * 2) + 2`.
* This makes them efficient for dynamic text handling.

## String vs StringBuffer vs StringBuilder

| Feature       | String (Immutable)           | StringBuffer (Mutable, Thread-safe) | StringBuilder (Mutable, Fast) |
|---------------|------------------------------|-------------------------------------|-------------------------------|
| Mutability    | ❌ Immutable                  | Mutable                             | Mutable                       |
| Thread Safety | ❌ Not safe                   | Synchronized (safe)                 | ❌ Not synchronized            |
| Performance   | Slow (new object every time) | Slower (due to sync)                | Fastest                       |
| Best Use Case | Small, secure text           | Multi-threaded applications         | Single-threaded applications  |

## Example of Performance Difference

```java
public class TestPerformance {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 100000; i++) {
            sb.append(" World");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Hello");
        for (int i = 0; i < 100000; i++) {
            sb2.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + "ms");
    }
}
```

Output (approx):

```
StringBuffer time: 50ms
StringBuilder time: 10ms
```

## Key Takeaways

* Use String if text is rarely modified.
* Use StringBuffer if working with multiple threads.
* Use StringBuilder if working in a single-threaded environment and performance matters.

Would you like me to also create a memory diagram showing how Strings vs StringBuffer/StringBuilder behave in memory
during concatenations? That way you’ll *see* why immutability vs mutability matters.
