//package threadconstructors;
//
//public class ThreadImplementationMain {
//    public static void main(String[] args) {
//
//        System.out.println("Hello, I am thread named : " + Thread.currentThread().getName());
//            //Hello, I am thread named : main
//
//        ThreadConstructors.CustomThread_1 t1 = new ThreadConstructors.CustomThread_1();
//        t1.start();
//            //Hello, Custom Thread Implementation : Thread-0
//
//        ThreadConstructors.CustomThread_2 t2 = new ThreadConstructors.CustomThread_2("Thread_0");
//        t2.start();
//            //Hello, Custom Named Thread Implementation :Thread_0
//
//        ThreadConstructors.RunnableThread runnableThread = new ThreadConstructors.RunnableThread();
//
//        Thread t3 = new Thread(runnableThread);
//        t3.start();
//            //Hello, I am thread with runnable implementation : Runnable_Thread_0
//
//        Thread t4 = new Thread(runnableThread, "Runnable_Thread_0");
//        t4.start();
//            //Hello, I am thread with runnable implementation : Thread-1
//    }
//}
