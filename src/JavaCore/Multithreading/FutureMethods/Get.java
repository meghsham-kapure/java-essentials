package JavaCore.Multithreading.FutureMethods;

//
//package FutureMethods;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class Get {
//    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Future <String> futureName =executorService.submit(()->"Meghsham");
//
//        try {
//            String name = futureName.get();
//            System.out.println("return value ==> "+name);
//        } catch (InterruptedException | ExecutionException | RuntimeException e) {
//            e.printStackTrace();
//        }
//
//        Future <Integer> futureNum =executorService.submit(()-> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException ex) {
//                throw new RuntimeException(ex);
//            }
//            return (int) (Math.random() * 10);
//        });
//        try {
//            Integer num = futureNum.get();
//            System.out.println("return value ==> "+num);
//        } catch (InterruptedException | ExecutionException | RuntimeException e) {
//            e.printStackTrace();
//        }
//
//        executorService.shutdown();999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999
//    };
//}
//
