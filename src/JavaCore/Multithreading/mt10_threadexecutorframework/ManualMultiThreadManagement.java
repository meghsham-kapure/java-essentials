package JavaCore.Multithreading.mt10_threadexecutorframework;

public class ManualMultiThreadManagement{
	public static void main (String args []){
		
		Thread  threadPool []  = new Thread [10];
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++){
			int num = i;	
			threadPool[i] = new Thread (()->{
				System.out.println("Factorial of number "+num+ " is "+factorial(num));
			});
			threadPool[i].start();
		}
		try {
			for (Thread i : threadPool ){
					i.join();
			}
		}catch (InterruptedException ex){
			ex.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time taken to excute "+ threadPool.length + " threads is "+ (endTime - startTime) );
	}
	
	
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
