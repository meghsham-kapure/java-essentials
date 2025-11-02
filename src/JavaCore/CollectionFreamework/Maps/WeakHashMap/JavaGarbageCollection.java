package JavaCore.CollectionFreamework.Maps.WeakHashMap;

import java.lang.ref.WeakReference;

public class JavaGarbageCollection {
    public static void main(String[] args) {
        System.out.println("Strong Reference Garbage Collection Simulation");

        //Strong Reference
        Object strongRefferenceObject = new Object();
        System.gc();
        try {
            System.gc();
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.print("At second " + i + " \t");
                System.out.println(strongRefferenceObject != null ?strongRefferenceObject : "null object");
                System.gc();
                if (i==3)
                    strongRefferenceObject = null;
            }
        } catch (Exception ignored) {
            System.out.println("Exception Ignored");
        }

        System.out.println("\n\n\n");
        System.out.println("Weak Reference Collection Simulation");
        // Weak Reference
        WeakReference<Object> weakReferenceObject = new WeakReference<>(new Object());

        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.print("At second " + i + " \t");

                // Check the referent
                System.out.println(weakReferenceObject.get() != null ? "Referent is alive" : "Referent is null");

                if (i == 2) {
                    System.gc(); // Explicitly invoke garbage collection at a specific point
                }
            }
        } catch (Exception ignored) {
            System.out.println("Exception Ignored");
        }
    }
}
