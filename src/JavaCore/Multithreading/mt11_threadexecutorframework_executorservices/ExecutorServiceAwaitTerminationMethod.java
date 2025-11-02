package CoreJavaTopics.java_multithreading.mt11_threadexecutorframework_executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceAwaitTerminationMethod {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable runnable = ()-> {
            System.out.println("Thread "+Thread.currentThread().getName()+" work ended");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread "+Thread.currentThread().getName()+" work ended");
        };

        for (int j =0; j < 10; j++) executorService.submit(runnable);

        executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
    }
}
