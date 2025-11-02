package JavaCore.Multithreading.mt09_threaddeadlocks;

class Pen {
    public synchronized void writeWithPenAndPaper(PaperA4 paperA4) {
        System.out.println(Thread.currentThread().getName() + " Writing with Pen and Borrowed Paper");
        try { Thread.sleep(100); } catch (InterruptedException e) { }
        paperA4.takePaper();
    }

    public synchronized void takePen() {
        System.out.println(Thread.currentThread().getName() + " Take this pen");
    }
}

class Paper {
    public synchronized void writeWithPaperAndPen(PenLexi penLexi) {
        System.out.println(Thread.currentThread().getName() + " Writing with Paper and Borrowed Pen");
        try { Thread.sleep(100); } catch (InterruptedException e) { }
        penLexi.takePen();
    }

    public synchronized void takePaper() {
        System.out.println(Thread.currentThread().getName() + " Take this Paper");
    }
}

public class P15_DeadlockExample {
    public static void main(String[] args) {
        PenLexi penLexi = new PenLexi();
        PaperA4 paperA4 = new PaperA4();

        Thread t1 = new Thread(() -> {
            penLexi.writeWithPenAndPaper(paperA4);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            paperA4.writeWithPaperAndPen(penLexi);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}

