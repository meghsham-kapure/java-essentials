package JavaCore.Multithreading.mt04_threadlambdaexpression;

public class P07_CreatingThreadsFromAnnonymousClass{
	public static void main (String args [] ){		
		Thread thead = new Thread (new Runnable (){
			@Override
			public void run (){
				for (int i = 0; i< 100; i ++){
					System.out.print(i+"\t");
				};
			}
		});
		thead.start();
	}
}
