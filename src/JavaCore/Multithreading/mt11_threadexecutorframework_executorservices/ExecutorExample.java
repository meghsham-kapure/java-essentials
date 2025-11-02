package CoreJavaTopics.java_multithreading.mt11_threadexecutorframework_executorservices;

//package ThreadExecuterFramework;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class ExecutorExample {
//
//    public static void main(String[] args) {
//        // Create an Executor using a fixed thread pool
//        Executor executor = Executors.newFixedThreadPool(5);
//
//        // Create a Runnable task
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Task executed by " + Thread.currentThread().getName());
//            }
//        };
//        ExecutorService
//        // Execute the task using the Executor
//        executor.execute(task);
//
//        // Shutdown the Executor (if using ExecutorService)
//        if (executor instanceof java.util.concurrent.ExecutorService) {
//            System.out.println("executor instanceof java.util.concurrent.ExecutorService ==> true");
//            ((java.util.concurrent.ExecutorService) executor).shutdown();
//        }else{
//            System.out.println("executor instanceof java.util.concurrent.ExecutorService ==> false");
//
//        }
//    }
//}
