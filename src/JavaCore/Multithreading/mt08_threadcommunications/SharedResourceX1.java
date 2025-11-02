package JavaCore.Multithreading.mt08_threadcommunications;

public class SharedResourceX1 {
    // Data
    private int data;

    // Flag indicating data is present or not
    private boolean hasData;

    // method will be called by Producer Thread to produce the data in data field
    // takes input, checks if some data is already there or not,
            // if its there then calling thread is put on wait state
            // if there isn't any data then it will store input into data
    public synchronized void produce(int data) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }

        this.data = data;
        hasData=true;
        System.out.println("Data Produced to Shared Resource : " + data + "\tBy"+Thread.currentThread().getName());
        notify();
        // after consuming data and setting hasData flag to true it,
        // notify waiting thread (randomly selected) that had called wait() on the shared resource.
        // when the method will return it will release the lock
    }

    // method that will call the consumer which checks if shared resource has data
        // if it had, consumes (displays it) , and set has data to false
        // if not then it waits

    public synchronized void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Data Consumed for Shared Resource : "+ data + "\tBy"+Thread.currentThread().getName() );
        hasData=false;
        notify();
        // after consuming data and setting hasData flag to false it,
        // notify waiting thread (randomly selected) that had called wait() on the shared resource.
        // when the method will return it will release the lock
    };

}