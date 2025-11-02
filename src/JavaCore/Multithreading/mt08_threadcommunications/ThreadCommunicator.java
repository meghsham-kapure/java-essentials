package JavaCore.Multithreading.mt08_threadcommunications;

public class ThreadCommunicator {
    public static void main(String[] args) throws InterruptedException {
        // Common resource for threads
        SharedResourceX1 sharedResourceX1 = new SharedResourceX1();

        // Thread producing data shared resource
        Thread producer = new Thread(new ProducerThread(sharedResourceX1),"Producer-Thread");

        // Thread consuming data from shared resource
        Thread consumer1 = new Thread(new ConsumerThread(sharedResourceX1),"Consumer-Thread-1");
        Thread consumer2 = new Thread(new ConsumerThread(sharedResourceX1),"Consumer-Thread-2");

        // Starting the threads
        producer.start();
        consumer1.start();
        consumer2.start();

    }
}
