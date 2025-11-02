package JavaCore.Multithreading.mt07_threadreentrantlocks;

import java.util.concurrent.locks.ReentrantLock;

public class P11_HomeExampleReentrantLock{
	public static void main (String args[]){
		Building building = new Building();
		
		Thread t1 = new Thread (()->{
			building.getApartment();
		},"T1");
		
		Thread t2 = new Thread (()->{
			building.getApartment();
		},"T2");
		
		t1.start();
		t2.start();
	}
}

class Building {
	private Object apartment;
	ReentrantLock lock =  new ReentrantLock();
	
	public void getApartment (){
		System.out.println(Thread.currentThread().getName() + " : Trying to get apartment and I have operned locks "+lock.getHoldCount());
		lock.lock();
		try{
				System.out.println(Thread.currentThread().getName() + " : I am inside apartment and I have operned locks "+lock.getHoldCount());
				getBedroom();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			lock.unlock();
			System.out.println(Thread.currentThread().getName() +" : I am out of apartment and I have operned locks "+lock.getHoldCount());
		}
	}
	
	public void getBedroom(){
		lock.lock();
		try{
			System.out.println(Thread.currentThread().getName() +" : I am inside apartment's bedroom and I have operned locks "+lock.getHoldCount());
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			lock.unlock();
			System.out.println(Thread.currentThread().getName() +" : I am out of apartment's bedroom and I have operned locks "+lock.getHoldCount());
			
		}
	}
	

}
