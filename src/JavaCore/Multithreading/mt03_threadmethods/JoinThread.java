package JavaCore.Multithreading.mt03_threadmethods;

public class JoinThread {
    public static void main(String[] args) {
        Runnable ThreadImplementation_1 = () ->{
            System.out.println("Start of thread 1");
            for (int i = 0; i <= 10000; i++) {
                if (i == 10000) {
                    System.out.println("end of thread 1");
                }
            }
        };

        Thread t1 = new Thread(ThreadImplementation_1);

        Runnable ThreadImplementation_2 = () ->{
            System.out.println("Start of thread 2");
            for (int i = 10; i >= 0; i--) {
               if (i == 0) {
                   System.out.println("Thread 2 loop ended");
               }
            }

            try{
                System.out.println("Waiting for T1 t1 to finish first");
                t1.join();
                //t2 thread waits t1 to finish first
            } catch ( Exception e){
                e.printStackTrace();
            }

            System.out.println("end of thread 2");
        };

        Thread t2 = new Thread(ThreadImplementation_2);


        // Thread_1 and Thread_2 runs simultaneously
        t1.start();
        t2.start();
    }
}
