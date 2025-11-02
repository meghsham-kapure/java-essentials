package CoreJavaTopics.java_multithreading.mt03_threadmethods;

class ValueStorage {
	static int value = 0;
}

class ValueGenerator extends Thread{
	ValueGenerator(String name){
		super(name);
	}
	
	public void run(){
		while(true){
			ValueStorage.value = (int) (Math.random()*1000);
			
			try {
            Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class ValueConsumer extends Thread{

	ValueConsumer(String name){
		super(name);
	}
	public void run(){
			for (int i = 0 ; i < 10 ; i++ ){
				try {
					System.out.println ("Current Value in Stroage => "+ValueStorage.value);
					Thread.sleep(500);
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
			}
	}
}
public class P05_CreatingDaemonThreads{
	
	public static void main (String args [] ){
	
		ValueGenerator valueGenerator = new ValueGenerator("ValueGenerator-1");
		ValueConsumer valueConsumer = new ValueConsumer("ValueConsumer-1");
		
		valueGenerator.setDaemon(true);
		
		System.out.println (valueGenerator.getName()+ " is a Daemon Thread " + valueGenerator.isDaemon() );
		System.out.println (valueConsumer.getName()+ " is a Daemon Thread "+ valueConsumer.isDaemon() );
		
		valueGenerator.start();
		valueConsumer.start();
	
	
	
	}
}


/*

PS C:\Users\kapur\OneDrive\Dokumen\Java_Practice_NoHelp> java .\P05_CreatingDaemonThreads.java
ValueGenerator-1 is a Daemon Thread true
ValueConsumer-1 is a Daemon Thread false
Current Value in Stroage => 0
Current Value in Stroage => 157
Current Value in Stroage => 907
Current Value in Stroage => 907
Current Value in Stroage => 312
Current Value in Stroage => 312
Current Value in Stroage => 451
Current Value in Stroage => 451
Current Value in Stroage => 750
Current Value in Stroage => 750

*/
