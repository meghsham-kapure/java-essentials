package JavaCore.Multithreading.mt01_threadconstructors;

public class CustomThread_2 extends  Thread {

    CustomThread_2 (String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Hello, Custom Named Thread Implementation :" + Thread.currentThread().getName());
    }
}
