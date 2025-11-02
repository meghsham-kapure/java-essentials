package JavaCore.Multithreading.mt02_threadlifecycle;

class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+" is in state "+Thread.currentThread().getState()+" [Running]");
		try{
			Thread.sleep(2000);
		}catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

class DaemonThread extends Thread{
	Thread t;
	DaemonThread(Thread t){
	this.t = t;
	}
	
	@Override
	public void run(){
		while (true){
			System.out.println("Observer : "+t.getName()+" is in state "+t.getState());
			try{
			Thread.sleep(500);
		}catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		}
	}
}



public class P04_ImplementingThreadLifeCycle{
	public static void main (String args [] ){
	
		System.out.println(Thread.currentThread().getName()+" : ");
		
		MyThread myThread = new MyThread();
		System.out.println(myThread.getName()+ " is in state "+myThread.getState());
		
		myThread.start();
		System.out.println(myThread.getName()+" is in state "+myThread.getState()+" [Ready to Run]");
	
		DaemonThread daemon = new DaemonThread(myThread);
		daemon.setDaemon(true);
		daemon.start();
		
		
		try{
			myThread.join();
		}catch (InterruptedException ex) {
			ex.printStackTrace();
		}finally{
			System.out.println(myThread.getName()+" is in state "+myThread.getState());
		}			
	}
}


/*

PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P04_ImplementingThreadLifeCycle.java
main :
Thread-0 is in state NEW
Thread-0 is in state RUNNABLE [Ready to Run]
Thread-0 is in state RUNNABLE [Running]
Observer : Thread-0 is in state TIMED_WAITING
Observer : Thread-0 is in state TIMED_WAITING
Observer : Thread-0 is in state TIMED_WAITING
Observer : Thread-0 is in state TIMED_WAITING
Thread-0 is in state TERMINATED

*/
