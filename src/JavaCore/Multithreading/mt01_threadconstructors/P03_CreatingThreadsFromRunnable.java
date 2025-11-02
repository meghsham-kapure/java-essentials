//package JavaCore.Multithreading.mt01_threadconstructors;
//
//
//class MyRunnableThread implements Runnable {
//	@Override
//	public void run () {
//		for (int i = 0; i < 10; i++){
//			System.out.println("Thread Creating Random Value " + i + " : " +  ((int) (Math.random()*10)) );
//		}
//	}
//}
//
//public class P03_CreatingThreadsFromRunnable{
//	public static void main (String args [] ){
//		MyRunnableThread runnableThread1 = new MyRunnableThread();
//		Thread thread1 = new Thread (runnableThread1);
//		thread1.start();
//	}
//}
//
///*
//
//Thread Creating Random Value 0 : 1
//Thread Creating Random Value 1 : 8
//Thread Creating Random Value 2 : 9
//Thread Creating Random Value 3 : 7
//Thread Creating Random Value 4 : 5
//Thread Creating Random Value 5 : 3
//Thread Creating Random Value 6 : 7
//Thread Creating Random Value 7 : 3
//Thread Creating Random Value 8 : 8
//Thread Creating Random Value 9 : 4
///*
