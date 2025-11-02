package JavaCore.Multithreading.mt02_threadlifecycle;

import java.util.Scanner;

public class ThreadLife {
    public static void main(String[] args) {
        final Object lock = new Object();

        // 1. After creating the object the thread is in NEW state
        ThreadImplementation_1 t1 = new ThreadImplementation_1("Thread-1", lock);
        ThreadImplementation_2 t2 = new ThreadImplementation_2("Thread-2", lock);
        System.out.println("NEW State of Thread-1 and Thread-2");

        System.out.println(t1.getState());

        //2. when the start() method is called threads
        t1.start();
        t2.start();

    }
}

class ThreadImplementation_1 extends Thread{
    private final Object lock;

    ThreadImplementation_1(String name, Object lock){
        super(name);
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock){
            System.out.println(getName()+ " Thread-1 is started running");

            Scanner sc = new Scanner(System.in);

            System.out.println("WAITING State");
            System.out.print(getName()+ " is asking, Enter a number : ");
            int num = sc.nextInt();

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i + " * " + num + " = " + (i + 1) * num);
            }

            System.out.println(getName()+ " is finished running, releasing lock");
            lock.notify();
        }
    }
}

class ThreadImplementation_2 extends Thread{
    private final Object lock;

    ThreadImplementation_2(String name, Object lock){
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(getName()+ " is started running");

            System.out.println(getName() + " is going to wait for 5 seconds (TIMED_WAITING)");

            try {
                lock.wait(5000); // wait on the lock object, not this
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(getName()+ " says, that enough, resumed after timed waiting !!! " );

            System.out.println(getName()+ " is finished running, releasing lock");
            lock.notify();
        }

    }
}
