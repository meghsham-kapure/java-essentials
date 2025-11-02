package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework.performancecomparisons;

public class FactorialSequentialExecution {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (long num = 1; num <= 10; num++) {
            System.out.println("Thread of execution : "+ Thread.currentThread().getName()+" for calculating Factorial("+num+") : " +factorial(num));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Total time spent on processing " + (endTime - startTime) );

    }

    public static long factorial (long num){
        long fact = 1;
        while (num >0){
            fact *= num--;
        }
        return fact;
    }
}

