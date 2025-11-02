//package JavaCore.Multithreading.mt07_threadreentrantlocks;
//
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//
//class ThreadTask implements Runnable{
//	private Lock unfairLock;
//	static int threadCounter = 0;
//
//	ThreadTask(Lock unfairLock){
//		this.unfairLock = unfairLock;
//	}
//
//	@Override
//	public void run (){
//		try{
//			unfairLock.tryLock();
//			System.out.println(Thread.currentThread().getName() + " : acquired fair lock");
//
//			int sum = 0;
//			for (int i = 0; i < 100; i++)
//				sum = sum + i +((int)(Math.random()*10));
//			System.out.println(Thread.currentThread().getName() + " => "+ sum );
//
//		}
//		catch (Exception ex){
//			ex.printStackTrace();
//		}
//		finally{
//			unfairLock.unlock();
//			System.out.println(Thread.currentThread().getName() + " : released fair lock\n");
//		}
//	}
//}
//
//public class P13_FairLock{
//	public static void main (String args [] ){
//
//	Lock  unfairLock= new ReentrantLock(true);
//
//	Thread thread_1 = new Thread (new ThreadTask (unfairLock),"Thread_1");
//	Thread thread_2 = new Thread (new ThreadTask (unfairLock),"Thread_2");
//	Thread thread_3 = new Thread (new ThreadTask (unfairLock),"Thread_3");
//	Thread thread_4 = new Thread (new ThreadTask (unfairLock),"Thread_4");
//	Thread thread_5 = new Thread (new ThreadTask (unfairLock),"Thread_5");
//
//	try{
//		thread_1.start();
//		Thread.sleep(1000);
//		thread_2.start();
//		Thread.sleep(1000);
//		thread_3.start();
//		Thread.sleep(1000);
//		thread_4.start();
//		Thread.sleep(1000);
//		thread_5.start();
//	}
//	catch (InterruptedException ex){
//		ex.printStackTrace();
//	}
//	}
//}
//
//
//
//
///*
//Output
//PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P13_FairLock.java
//Thread_1 : acquired fair lock
//Thread_1 => 5396
//Thread_1 : released fair lock
//
//Thread_2 : acquired fair lock
//Thread_2 => 5399
//Thread_2 : released fair lock
//
//Thread_3 : acquired fair lock
//Thread_3 => 5382
//Thread_3 : released fair lock
//
//Thread_4 : acquired fair lock
//Thread_4 => 5396
//Thread_4 : released fair lock
//
//Thread_5 : acquired fair lock
//Thread_5 => 5415
//Thread_5 : released fair lock
//
//PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P13_FairLock.java
//Thread_1 : acquired fair lock
//Thread_1 => 5390
//Thread_1 : released fair lock
//
//Thread_2 : acquired fair lock
//Thread_2 => 5401
//Thread_2 : released fair lock
//
//Thread_3 : acquired fair lock
//Thread_3 => 5355
//Thread_3 : released fair lock
//
//Thread_4 : acquired fair lock
//Thread_4 => 5409
//Thread_4 : released fair lock
//
//Thread_5 : acquired fair lock
//Thread_5 => 5382
//Thread_5 : released fair lock
//
//PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P13_FairLock.java
//Thread_1 : acquired fair lock
//Thread_1 => 5383
//Thread_1 : released fair lock
//
//Thread_2 : acquired fair lock
//Thread_2 => 5407
//Thread_2 : released fair lock
//
//Thread_3 : acquired fair lock
//Thread_3 => 5436
//Thread_3 : released fair lock
//
//Thread_4 : acquired fair lock
//Thread_4 => 5388
//Thread_4 : released fair lock
//
//Thread_5 : acquired fair lock
//Thread_5 => 5403
//Thread_5 : released fair lock
//
//PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp>
//*/
