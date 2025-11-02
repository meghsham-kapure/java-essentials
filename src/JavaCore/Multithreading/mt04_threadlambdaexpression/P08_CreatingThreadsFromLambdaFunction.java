package JavaCore.Multithreading.mt04_threadlambdaexpression;

public class P08_CreatingThreadsFromLambdaFunction{
	public static void main (String args [] ){	
		Thread thead = new Thread ( () -> {
				for (int i = 0; i< 100; i ++){
					System.out.print(i+"\t");
				}
			}
		);
		thead.start();
	}
}
