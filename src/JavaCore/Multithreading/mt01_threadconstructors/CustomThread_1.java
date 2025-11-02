package JavaCore.Multithreading.mt01_threadconstructors;

public class CustomThread_1 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello, Custom Thread Implementation : " + currentThread().getName());
    }
}
