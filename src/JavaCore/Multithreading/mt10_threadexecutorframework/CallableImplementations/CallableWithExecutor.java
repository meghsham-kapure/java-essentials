package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework.callableimplementations;

import java.util.concurrent.*;

class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 101;
    }
}

public class CallableWithExecutor {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new MyCallable());

        try{
            Integer i = future.get(1, TimeUnit.MILLISECONDS);
            System.out.println(i);
        }
        catch (ExecutionException | TimeoutException| InterruptedException e) {
            System.out.println("Could not fetch a result");
            throw new RuntimeException(e);
        }

        executorService.shutdown();

    }
}
