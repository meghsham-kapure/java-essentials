package JavaCore.Multithreading.mt08_threadcommunications;

public class ConsumerThread extends Thread {
    private final SharedResourceX1 sharedResourceX1;

    public ConsumerThread(SharedResourceX1 sharedResourceX1) {
        this.sharedResourceX1 = sharedResourceX1;
    }

    @Override
    public void run() {
        System.out.println("Consumer Thread " +Thread.currentThread().getName()+ " started running");

        while (true) {
            sharedResourceX1.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // System.out.println("Consumer Thread " +Thread.currentThread().getName()+ " stopped running");
    };
}