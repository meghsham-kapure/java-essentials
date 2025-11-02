package CoreJavaTopics.java_multithreading.mt11_threadexecutorframework_executorservices;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeMethod {

    public static void main(String[] args) {
        usingInvolvedAny();


    }

    public static void usingInvolvedAny(){
        ArrayList<Callable<Long>> callablesThreads = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int finalI = i;
            callablesThreads.add(()->{
                Thread.sleep(500);
                return Thread.currentThread().threadId();
            });
        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try {
            Long result =  executorService.invokeAny(callablesThreads);
            System.out.println(result);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

    public static void usingInvolvedAll(){
        ArrayList<Callable<Integer>> callablesThreads = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int finalI = i;
            callablesThreads.add(()->{
                Thread.sleep(500);
                return finalI;
            });
        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try {
            List<Future<Integer>> future =  executorService.invokeAll(callablesThreads);
            for (Future<Integer> f : future){
                System.out.println(f.get());
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
