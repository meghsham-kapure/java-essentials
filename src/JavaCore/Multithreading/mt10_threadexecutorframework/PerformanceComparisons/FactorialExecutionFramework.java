package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework.performancecomparisons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FactorialExecutionFramework {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        for (int i = 0; i < 10; i++) {
            int num = i+1;
            executorService.submit(()->{
                System.out.println("Thread of execution : "+ Thread.currentThread().getName()+" for calculating Factorial("+num+") : " +factorial(num));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total time spent on processing " + (endTime - startTime) );
    }

    public static long factorial (long num){
        long fact = 1;
        while (num >0){
            fact *= num--;
        }
        return fact;
    }
}