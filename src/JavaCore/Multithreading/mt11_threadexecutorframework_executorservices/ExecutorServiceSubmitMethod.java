//package CoreJavaTopics.java_multithreading.mt11_threadexecutorframework_executorservices;
//
//
//import java.util.concurrent.*;
//
//public class ExecutorServiceSubmitMethod {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
////        usingSubmitWithRunnableImplementation();
////        usingSubmitWithCallableImplementation();
//        usingSubmitWithCallableImplementationAndPredefinedReturnValue();
//    }
//
//    public static void usingSubmitWithRunnableImplementation(){
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Runnable runnable = ()-> System.out.println("Hello World");
//        for (int j =0; j < 10; j++) executorService.submit(runnable);
//        executorService.shutdown();
//    }
//
//    public static void usingSubmitWithCallableImplementation() throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Callable<Integer> callable = ()-> 101;
//        for (int j =0; j < 10; j++) {
//            Future<Integer> future = executorService.submit(callable);
//            System.out.println(future.get());
//
//        };
//        executorService.shutdown();
//    }
//
//    public static void usingSubmitWithCallableImplementationAndPredefinedReturnValue() throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Runnable runnableWithPredefinedReturnValue = ()-> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        };
//        for (int j =0; j < 10; j++) {
//            Future<String> future = executorService.submit(runnableWithPredefinedReturnValue,"1 second waiting done");
//            System.out.println(future.get());
//
//        };
//
//        while (true){
//
//        }
//        executorService.shutdown();
//    }
//}
