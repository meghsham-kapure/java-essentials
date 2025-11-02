package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework.futureimplementations;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureValue {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        Future<String> value = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName()+" is sleeping");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" is awake");
            return "Future Value";
        });

        while (!value.isDone()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Processing future value, please wait");


        }

        try {
            System.out.println("Processed future value => " + value.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        //
//        do{
//            try {
//                System.out.println("Future Value => " + value.get());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//        }while (!value.isDone());

    }

}
