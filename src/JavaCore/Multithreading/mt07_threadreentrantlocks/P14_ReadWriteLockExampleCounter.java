package JavaCore.Multithreading.mt07_threadreentrantlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteCounter{
	private int counter = 0;
	private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
	private final Lock readLock=rwLock.readLock();
	private final Lock writeLock=rwLock.writeLock();	
	
	public int getCounter(){
		readLock.lock();
		try{
			Thread.sleep(500);
			return counter;
		}catch (InterruptedException iex) {
			iex.printStackTrace();
			return -1;
        }finally {
			readLock.unlock();
		}
	}
	
	public int incrementCounter(){
		writeLock.lock();
		try{		
			Thread.sleep(1000);	
			return ++counter;
		}catch (InterruptedException iex) {
			iex.printStackTrace();
			return -1;
        }finally {
			writeLock.unlock();
		}
	}
}

public class P14_ReadWriteLockExampleCounter{
	public static void main(String args [] ){
		ReadWriteCounter readWriteCounter = new ReadWriteCounter();
		
		Runnable writeTask = ()->{
			for (int i = 0; i < 10; i++)
				System.out.println(Thread.currentThread().getName()+" Writing Thread : Incremented counter : " + readWriteCounter.incrementCounter());	
		};
			
		Runnable readTask = ()->{
			for (int i = 0; i < 10; i++)
				System.out.println(Thread.currentThread().getName()+" Reading Thread : Current Value of counter : " + readWriteCounter.getCounter());
		};
		
		Thread t1 = new Thread (writeTask);
		Thread t2 = new Thread (readTask);
		Thread t3 = new Thread (writeTask);
		Thread t4 = new Thread (readTask);
					
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}


/*

PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P14_ReadWriteLockExampleCounter.java
Thread-0 Writing Thread : Incremented counter : 1
Thread-2 Writing Thread : Incremented counter : 2
Thread-1 Reading Thread : Current Value of counter : 2
Thread-3 Reading Thread : Current Value of counter : 2
Thread-0 Writing Thread : Incremented counter : 3
Thread-2 Writing Thread : Incremented counter : 4
Thread-1 Reading Thread : Current Value of counter : 4
Thread-3 Reading Thread : Current Value of counter : 4
Thread-0 Writing Thread : Incremented counter : 5
Thread-2 Writing Thread : Incremented counter : 6
Thread-1 Reading Thread : Current Value of counter : 6
Thread-3 Reading Thread : Current Value of counter : 6
Thread-0 Writing Thread : Incremented counter : 7
Thread-2 Writing Thread : Incremented counter : 8
Thread-1 Reading Thread : Current Value of counter : 8
Thread-3 Reading Thread : Current Value of counter : 8
Thread-0 Writing Thread : Incremented counter : 9
Thread-2 Writing Thread : Incremented counter : 10
Thread-1 Reading Thread : Current Value of counter : 10
Thread-3 Reading Thread : Current Value of counter : 10
Thread-0 Writing Thread : Incremented counter : 11
Thread-2 Writing Thread : Incremented counter : 12
Thread-1 Reading Thread : Current Value of counter : 12
Thread-3 Reading Thread : Current Value of counter : 12
Thread-0 Writing Thread : Incremented counter : 13
Thread-2 Writing Thread : Incremented counter : 14
Thread-1 Reading Thread : Current Value of counter : 14
Thread-3 Reading Thread : Current Value of counter : 14
Thread-0 Writing Thread : Incremented counter : 15
Thread-2 Writing Thread : Incremented counter : 16
Thread-3 Reading Thread : Current Value of counter : 16
Thread-1 Reading Thread : Current Value of counter : 16
Thread-0 Writing Thread : Incremented counter : 17
Thread-2 Writing Thread : Incremented counter : 18
Thread-3 Reading Thread : Current Value of counter : 18
Thread-1 Reading Thread : Current Value of counter : 18
Thread-0 Writing Thread : Incremented counter : 19
Thread-2 Writing Thread : Incremented counter : 20
Thread-3 Reading Thread : Current Value of counter : 20
Thread-1 Reading Thread : Current Value of counter : 20
PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp>

*/
