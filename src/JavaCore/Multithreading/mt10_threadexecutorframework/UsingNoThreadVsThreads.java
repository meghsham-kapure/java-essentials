package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.lang.Thread.sleep;

public class UsingNoThreadVsThreads {

    public static void main(String[] args) throws InterruptedException {
        usingNoThreads();
        usingThreads();
        usingThreadPool();
    }

    public static void usingThreadPool() throws InterruptedException {
        long startTime = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 20; i++) {
            final int effectiveFinal_i = i;
            Future<?> futureResult = executorService.submit(() -> {
                try {
                    System.out.println(effectiveFinal_i + 1 + "==>" + factorial(effectiveFinal_i + 1));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Thread interrupted: " + e.getMessage());
                }
            });
        }

        executorService.shutdown(); // Shutdown the executor service
        while (!executorService.isTerminated()) {};

        long endTime = System.currentTimeMillis();
        System.out.println("####\t" + "Using Thread Pool time taken is " + (endTime - startTime) + "\t####");
    }

    public static void usingThreads() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[20];

        for (int i = 0; i < threads.length; i++) {
            final int effectiveFinal_i = i;
            threads[i] = new Thread(() -> {
                try {
                    System.out.println(effectiveFinal_i + 1 + "==>" + factorial(effectiveFinal_i + 1));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Thread interrupted: " + e.getMessage());
                }
            });
            sleep(100);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("####\t" + "Using Threads time taken is " + (endTime - startTime) + "\t####");
    }

    public static void usingNoThreads() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 20; i++) {
            sleep(100);
            System.out.println(i + "==>" + factorial(i));
        }

        long endTime = System.currentTimeMillis();
        System.out.println("####\t" + "Using no threads time taken is " + (endTime - startTime) + "\t####");
    }

    public static long factorial(long number) throws InterruptedException {
        sleep(100);
        long result = 1;
        while (number > 0) {
            result *= number--;
        }
        return result;
    }
}
