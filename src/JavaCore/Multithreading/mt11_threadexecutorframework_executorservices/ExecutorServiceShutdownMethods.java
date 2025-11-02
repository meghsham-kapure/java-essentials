package CoreJavaTopics.java_multithreading.mt11_threadexecutorframework_executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceShutdownMethods {
    public static void main(String[] args) {
        usingShutdown();
        usingShutdownNow();
    }

    public static void usingShutdown(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable runnable = ()-> System.out.println("Hello World");
        for (int j =0; j < 10; j++) executorService.submit(runnable);
        executorService.shutdown();
    }
    public static void usingShutdownNow(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable runnable = ()-> System.out.println("HI World");
        for (int j =0; j < 10; j++) executorService.submit(runnable);
        executorService.shutdownNow();
    }
}
