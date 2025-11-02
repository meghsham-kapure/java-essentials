package JavaCore.Multithreading.mt07_threadreentrantlocks;

	import java.util.concurrent.locks.Lock;
	import java.util.concurrent.locks.ReentrantLock;


	class ThreadTask implements Runnable{
		private Lock unfairLock;

		ThreadTask(Lock unfairLock){
			this.unfairLock = unfairLock;
		}

		@Override
		public void run (){
			try{	
				unfairLock.lock();
				System.out.println(Thread.currentThread().getName() + " : acquired unfair lock");
				
				int sum = 0;
				for (int i = 0; i < 100; i++)
					sum = sum + i +((int)(Math.random()*10));
				System.out.println(Thread.currentThread().getName() + " => "+ sum );
				
			}
			finally{
				System.out.println(Thread.currentThread().getName() + " : released unfair lock\n");
				unfairLock.unlock();
			}
		}
	}

	public class P12_UnfairLock{
		public static void main (String args [] ){
		
		Lock  unfairLock= new ReentrantLock();
		
		Thread thread_1 = new Thread (new ThreadTask (unfairLock),"Thread_1");
		Thread thread_2 = new Thread (new ThreadTask (unfairLock),"Thread_2");
		Thread thread_3 = new Thread (new ThreadTask (unfairLock),"Thread_3");
		Thread thread_4 = new Thread (new ThreadTask (unfairLock),"Thread_4");
		Thread thread_5 = new Thread (new ThreadTask (unfairLock),"Thread_5");
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
		thread_4.start();
		thread_5.start();


		}
	}

	/*
	Output
	PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P12_UnfairLock.java
	Thread_1 : acquired unfair lock
	Thread_1 => 5414
	Thread_1 : released unfair lock

	Thread_3 : acquired unfair lock
	Thread_3 => 5453
	Thread_3 : released unfair lock

	Thread_4 : acquired unfair lock
	Thread_4 => 5372
	Thread_4 : released unfair lock

	Thread_2 : acquired unfair lock
	Thread_2 => 5417
	Thread_2 : released unfair lock

	Thread_5 : acquired unfair lock
	Thread_5 => 5446
	Thread_5 : released unfair lock

	PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P12_UnfairLock.java
	Thread_1 : acquired unfair lock
	Thread_1 => 5380
	Thread_1 : released unfair lock

	Thread_2 : acquired unfair lock
	Thread_2 => 5408
	Thread_2 : released unfair lock

	Thread_5 : acquired unfair lock
	Thread_5 => 5427
	Thread_5 : released unfair lock

	Thread_3 : acquired unfair lock
	Thread_3 => 5394
	Thread_3 : released unfair lock

	Thread_4 : acquired unfair lock
	Thread_4 => 5475
	Thread_4 : released unfair lock

	PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P12_UnfairLock.java
	Thread_1 : acquired unfair lock
	Thread_1 => 5360
	Thread_1 : released unfair lock

	Thread_5 : acquired unfair lock
	Thread_5 => 5392
	Thread_5 : released unfair lock

	Thread_3 : acquired unfair lock
	Thread_3 => 5379
	Thread_3 : released unfair lock

	Thread_2 : acquired unfair lock
	Thread_2 => 5359
	Thread_2 : released unfair lock

	Thread_4 : acquired unfair lock
	Thread_4 => 5395
	Thread_4 : released unfair lock
	*/
