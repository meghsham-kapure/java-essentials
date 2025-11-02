package CoreJavaTopics.java_multithreading.mt10_threadexecutorframework;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P18_ExececuterServiceThreadManagement{
	public static void main (String args []){
	
		long startTime = System.currentTimeMillis();
	
		ExecutorService exeSer = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i<10; i++){
			int num = i;
			exeSer.submit(()-> {
				System.out.println("Factorial of number "+num+ " is "+factorial(num));
			});	
		}
		
		try{
			exeSer.awaitTermination(2, TimeUnit.SECONDS);
				System.out.println("Interrrupting threads Shutting Down");
			    exeSer.shutdownNow();
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}	
		
		finally{
			System.out.println("Shut Down Completed");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken to excute threads is "+ (endTime - startTime) );
	} //main
	
	public static long factorial (int num){
		int factorial = 1;
		
		while (num > 0)
				factorial *=num--; 
		
		try{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex){
			ex.printStackTrace();
		}
			return factorial;
	}
}

