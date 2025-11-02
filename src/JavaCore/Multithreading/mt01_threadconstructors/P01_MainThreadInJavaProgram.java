package JavaCore.Multithreading.mt01_threadconstructors;

public class P01_MainThreadInJavaProgram{
	public static void main (String args [] ){
		System.out.println("Current Thread executing is => " 
		+ Thread.currentThread().getName() );
		
		for (int i = 0 ; i < 10; i++){
			System.out.println("Counter : " + i );
		}
		
		
	}
}
/*

PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P01_MultiThreading.java
Current Thread executing is => main
Counter : 0
Counter : 1
Counter : 2
Counter : 3
Counter : 4
Counter : 5
Counter : 6
Counter : 7
Counter : 8
Counter : 9


*/
