package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework.callableimplementations;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableWithThread {
    public static void main(String[] args) {
        Callable <Integer> callableImplementation = () ->{
            Thread.sleep(1000);
            return 101;
        };

        FutureTask <Integer> futureTask = new FutureTask<>(callableImplementation);
        Thread thread = new Thread(futureTask);

        thread.run();

        try {
            System.out.println(futureTask.get());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
