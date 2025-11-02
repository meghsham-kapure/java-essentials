package JavaCore.Multithreading.mt08_threadcommunications;

// Class that creates resourse
class SharedResource{
	private int data; // actual data
	private boolean hasData; // flag to indicate newer data presence
	
	//method that creats data when its absent or wait to be data to be consumed
	public synchronized void produce(int data){
		//  if the flag is true the thead goes in waiting state
		while (hasData){
			try{
				wait();
			} catch (InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		}
		
		// if flag is true then new data is inserted, hasData flag is set to true by producer and consumer thread which is in wait state is nofified
		this.data = data;
		System.out.println("Produced : "+data);
		hasData=true;
		notifyAll(); 
	}
	
	public synchronized void consume(){
	// method that consume the data if it present or wait to be added
		while(!hasData){
			try{
				wait();
			}
			catch (InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.println("Consume  : "+data+" \n");
		data =-1;
		hasData=false;
		notifyAll();
		
	}
}


class Producer implements Runnable{
	private SharedResourceX1 resourse;
	
	Producer(SharedResourceX1 resourse){
	this.resourse=resourse;
	}
	
	@Override
	public void run(){
		for (int i = 0; i <10; i++)
			resourse.produce ((int) (Math.random()*10));
	}
}

class Consumer implements Runnable{
	private SharedResourceX1 resourse;
	
	Consumer(SharedResourceX1 resourse){
	this.resourse=resourse;
	}

	@Override
	public void run(){
		for (int i = 0; i <10; i++)
			resourse.consume();
	}
}


public class P16_ThreadCommunication{
	public static void main(String args []){
		SharedResourceX1 resource = new SharedResourceX1();
		
		Thread producerThread = new Thread ( new Producer (resource));
		Thread consumerThread = new Thread ( new Consumer (resource));
		
		producerThread.start();
		consumerThread.start();
		
		// Thread producerThread2 = new Thread ( new Producer (resource));
		// Thread consumerThread2 = new Thread ( new Consumer (resource));
		
		// producerThread2.start();
		// consumerThread2.start();
		
	}
}
