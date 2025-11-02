package JavaCore.Multithreading.mt01_threadconstructors;

class MyThread extends Thread{
	@Override
	public void run(){
		for (int i = 0; i < 10 ; i++){
			System.out.println("Thread 1 Counter : " + i );
		}
	}
};


public class P02_CreatingThreadsFromThreadClass{
	public static void main (String args [] ){
		MyThread t1 = new MyThread();
		t1.start();
		
		for (int i = 10; i < 20 ; i++){
			System.out.println("Main Thread Counter : " + i );
		}
	}
}

/*

PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P02_CreatingThreadsFromThreadClass.java
Main Thread Counter : 10
Main Thread Counter : 11
Main Thread Counter : 12
Main Thread Counter : 13
Main Thread Counter : 14
Main Thread Counter : 15
Main Thread Counter : 16
Thread 1 Counter : 0
Thread 1 Counter : 1
Thread 1 Counter : 2
Thread 1 Counter : 3
Thread 1 Counter : 4
Thread 1 Counter : 5
Thread 1 Counter : 6
Thread 1 Counter : 7
Thread 1 Counter : 8
Thread 1 Counter : 9
Main Thread Counter : 17
Main Thread Counter : 18
Main Thread Counter : 19
PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp>

*/
