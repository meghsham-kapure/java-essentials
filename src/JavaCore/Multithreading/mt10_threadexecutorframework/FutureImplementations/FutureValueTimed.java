package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework.futureimplementations;

import java.util.concurrent.*;

public class FutureValueTimed {

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

        try {
            System.out.println(value.get(250, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
        finally {
            executorService.shutdown();
        }
    }
}
