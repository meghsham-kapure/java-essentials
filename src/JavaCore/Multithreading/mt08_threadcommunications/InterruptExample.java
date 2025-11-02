package JavaCore.Multithreading.mt08_threadcommunications;

public class InterruptExample extends Thread {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Thread is running...");
            // Simulate some work
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted while sleeping");
                // Restore the interrupted status
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread is exiting");
    }

    public static void main(String[] args) {
        InterruptExample thread = new InterruptExample();
        thread.start();

        try {
            Thread.sleep(3000); // Let the thread run for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); // Interrupt the thread
    }
}
