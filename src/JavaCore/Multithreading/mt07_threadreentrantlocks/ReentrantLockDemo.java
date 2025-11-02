package JavaCore.Multithreading.mt07_threadreentrantlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLockDemo demo = new ReentrantLockDemo();
        demo.outerMethod();
    }

    Lock lock = new ReentrantLock();

    public  void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer method calling inner method");
            innerMethod();
        }
        finally {
            lock.unlock();
            System.out.println("Outer method unlock");
        }
    }

    public  void innerMethod(){
        lock .lock();
        try{
            System.out.println("Inner method called ");
        }
        finally {
            lock.unlock();
            System.out.println("Inner method unlock");

        }
    }
}
