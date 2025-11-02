package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework.executorinterface;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ImplementingExecutorInterface {
    public static void main(String[] args) {
        Executor executor1 = Executors.newSingleThreadExecutor();

        executor1.execute(()->{
            System.out.println("Hello");
        });

        Executor executor2 = Executors.newFixedThreadPool(2);


        for (int i = 0; i < 10; i++) {
            executor2.execute(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getId()+"\t:\t"+Thread.currentThread().getName());
            });
        }

    }

}
