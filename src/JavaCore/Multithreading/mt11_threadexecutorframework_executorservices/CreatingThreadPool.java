package CoreJavaTopics.java_multithreading.mt11_threadexecutorframework_executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CreatingThreadPool {
    public static void main(String[] args) throws InterruptedException {

        int taskExecuted = 0;
        // Create ThreadPool with 5 threads fixed
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        System.out.println("START");
        for (int i = 1; i <= 5; i++) {
            int effectiveFinal_i = i;
            executorService.submit(() -> System.out.print(effectiveFinal_i + "\t\t"));
            executorService.submit(() -> System.out.println(effectiveFinal_i +" => "+factorial(effectiveFinal_i)));
//            Thread.sleep(10000);10000
            taskExecuted++;
        }
        System.out.println("END");

        System.out.println("SHUTDOWN_START ");

        executorService.shutdown();
        System.out.println("\nX======>"+taskExecuted);
        System.out.println("SHUTDOWN_END ");


    }

    public static long factorial(long number){
        long result = 1;
        do{
            result*=number--;
        }while (number>0);
        return result;
    }
}
