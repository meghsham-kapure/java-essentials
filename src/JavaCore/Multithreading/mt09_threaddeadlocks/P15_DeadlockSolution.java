package JavaCore.Multithreading.mt09_threaddeadlocks;

class PenLexi {
    public void writeWithPenAndPaper(PaperA4 paperA4) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " Acquired Pen Lock");
            try { Thread.sleep(100); } catch (InterruptedException e) { }

            synchronized (paperA4) {
                System.out.println(Thread.currentThread().getName() + " Writing with Pen and Paper");
            }
        }
    }

    public void takePen() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " Take this pen");
        }
    }
}

class PaperA4 {
    public void writeWithPaperAndPen(PenLexi penLexi) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " Acquired Paper Lock");
            try { Thread.sleep(100); } catch (InterruptedException e) { }

            synchronized (penLexi) {
                System.out.println(Thread.currentThread().getName() + " Writing with Paper and Pen");
            }
        }
    }

    public void takePaper() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " Take this Paper");
        }
    }
}

public class P15_DeadlockSolution {
    public static void main(String[] args) {
        PenLexi penLexi = new PenLexi();
        PaperA4 paperA4 = new PaperA4();

        Thread t1 = new Thread(() -> {
            // Always acquire Pen first, then Paper
            synchronized (penLexi) {
                synchronized (paperA4) {
                    System.out.println("Thread-1 Writing using Pen and Paper");
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            // Same global lock order: Pen → Paper
            synchronized (penLexi) {
                synchronized (paperA4) {
                    System.out.println("Thread-2 Writing using Pen and Paper");
                }
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}

