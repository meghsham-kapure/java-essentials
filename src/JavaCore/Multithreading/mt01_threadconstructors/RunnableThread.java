package JavaCore.Multithreading.mt01_threadconstructors;

public class RunnableThread implements Runnable{

    @Override
    public void run(){
        System.out.println("Hello, I am thread with runnable implementation : " + Thread.currentThread().getName());
    }
}

