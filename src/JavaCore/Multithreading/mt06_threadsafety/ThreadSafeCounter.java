//package CoreJavaTopics.java_multithreading.mt06_threadsafety;
//
//public class ThreadSafeCounter {
//    private int count = 0;
//
//    // Thread-safe method using synchronized
//    public synchronized void increment() {
//        count++;
//    }
//
//    // Thread-safe getter
//    public synchronized int getCount() {
//        return count;
//    }
//}
//
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class AtomicCounterExample {
//    private AtomicInteger count = new AtomicInteger(0);
//
//    // Thread-safe without synchronized
//    public void increment() {
//        count.incrementAndGet();
//    }
//
//    public int getCount() {
//        return count.get();
//    }
//}
