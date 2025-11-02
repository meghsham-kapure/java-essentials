package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework.performancecomparisons;

public class FactorialSynchronousExecution {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Thread threads[] = new Thread [10];

        for (int i = 0; i < 10; i++) {
            int num = i+1;
            threads[i]= new Thread(()->{
                System.out.println("Thread of execution : "+ Thread.currentThread().getName()+" for calculating Factorial("+num+") : " +factorial(num));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
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