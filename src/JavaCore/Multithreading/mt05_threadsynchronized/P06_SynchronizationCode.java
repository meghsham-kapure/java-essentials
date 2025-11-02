package JavaCore.Multithreading.mt05_threadsynchronized;

class CounterStorge {
	private long counter = 0;
	
	public long getCounter(){
		return counter;
	} 
	
	public void showCurrentCounter(){
		System.out.println(Thread.currentThread().getName()+" Current Value of Counter => " + getCounter());
	} 
	
	// public synchronized void incrementCounter(){
	// 	counter++;
	// }
	
	public  void incrementCounter(){
		synchronized(this){
			counter++;
		}
	}
	
	
}

class MyThread extends Thread {
	CounterStorge counterStorge;
	
	MyThread(String name, CounterStorge counterStorge){
		super(name);
		this.counterStorge = counterStorge;
	}

	public void  run(){
		for (int i = 0 ; i < 5000 ; i++){
	
			counterStorge.incrementCounter();
			
		}
	}
}

public class P06_SynchronizationCode{
	public static void main (String args [] ){
		CounterStorge counterStorge = new CounterStorge();
		MyThread myThread1 = new MyThread("my_Thread_1",counterStorge);
		MyThread myThread2 = new MyThread("my_Thread_2",counterStorge);
		
		myThread1.start();
		myThread2.start();
	
		try {
			myThread1.join();
			myThread2.join();
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}finally{
			System.out.println("FINAL COUNTER VALUE "+ counterStorge.getCounter());
		}
	}
}


/*

PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P06_SynchronizationCode.java
FINAL COUNTER VALUE 8558
PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P06_SynchronizationCode.java
FINAL COUNTER VALUE 10000
PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P06_SynchronizationCode.java
FINAL COUNTER VALUE 10000
PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P06_SynchronizationCode.java
FINAL COUNTER VALUE 7077
PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P06_SynchronizationCode.java
FINAL COUNTER VALUE 7942

*/
