package CoreJavaTopics.java_multithreading.mt11_threadexecutorframework_executorservices;

public class HandlingMultiThreads {
    public static void main(String[] args) throws InterruptedException {
        withoutThreads();
        System.out.println();
        withThreads();
    }

    public static void withoutThreads() throws InterruptedException {
        long startTimeMLs = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.print("\tWithout threads, Counter : "+i + "=>" + System.currentTimeMillis());
            Thread.sleep(10);
        }


        long endTimeMls =  System.currentTimeMillis();
        long totalExecutionTime = endTimeMls - startTimeMLs;
        float totalExecutionTimeInSeconds = totalExecutionTime /1000.0f;
        System.out.print("\nwithoutThreads() =>Total time spent on running in seconds "+ totalExecutionTimeInSeconds);

    }

    public static void withThreads() {
        long startTimeMLs = System.currentTimeMillis();

        Thread [] threads = new Thread [10000];

        for (int i = 0; i < threads.length; i++) {
            int effectivelyFinal_i = i;
            threads[i] = new Thread(()-> {
                System.out.print("\tWith thread, Counter : "+effectivelyFinal_i + "=>" + System.currentTimeMillis());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long endTimeMls =  System.currentTimeMillis();
        long totalExecutionTime = endTimeMls - startTimeMLs;
        float totalExecutionTimeInSeconds = totalExecutionTime /1000.0f;
        System.out.print("\nwithThreads()=>Total time spent on running in seconds "+ totalExecutionTimeInSeconds);

    }
}
