package JavaCore.Multithreading.mt07_threadreentrantlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class BankAccountSBI {
	private int accountBalance = 1000;
	private final Lock lock = new ReentrantLock();

	public void credit(int money){
		try{
			if(lock.tryLock(6000,TimeUnit.MILLISECONDS)){
				System.out.println(Thread.currentThread().getName()+" Crediting Money => " + money);
				try{
					System.out.println("\tProcessing Transaction");
					accountBalance += money;
					Thread.sleep(2000);
					System.out.println("\tCurrent Account Balance ==> " + getAccountBalance());
					System.out.println("\tCompleted Transaction");
				}catch (InterruptedException ex){
					ex.printStackTrace();
				}
				finally {
					lock.unlock();
				}

			}
		}
		catch (InterruptedException ex){
			ex.printStackTrace();
		}
	}

	public void debit(int money){
		try{
			if (lock.tryLock(6000,TimeUnit.MILLISECONDS)){
				System.out.println(Thread.currentThread().getName()+" Debiting Money => " + money);
                try {
                    System.out.println("\tProcessing Transaction");
                    if (money <= accountBalance) {
                        accountBalance -= money;
                    } else {
                        System.out.println("\t\tYou have insufficient balance");
                    }
                    Thread.sleep(4000);
                    System.out.println("\tCurrent Account Balance ==> " + getAccountBalance());
                    System.out.println("\tCompleted Transaction");
                }catch (InterruptedException ex){
					ex.printStackTrace();
				}
				finally {
					lock.unlock();
				}
			}
		}
		catch (InterruptedException ex){
			ex.printStackTrace();
		}
	}

	public int getAccountBalance () {
		return accountBalance;
	}
}



class P10_BankAccountLockingTimed{
	public static void main (String args [] ){
		BankAccountSBI bAcc = new BankAccountSBI();
		Thread t1 = new Thread (()->{
			bAcc.credit(10000);
			bAcc.debit(5000);
		});


		Thread t2 = new Thread (()->{
			bAcc.credit(20000);
			bAcc.debit(2000);
		});
		System.out.println("Starting Transactions");
		t1.start();
		t2.start();


		try{
			t1.join();
			t2.join();
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("Ending Transactions");
	}
}



/*
Starting Transactions
T1 Crediting Money => 10000
	Processing Transaction
	Current Account Balance ==> 11000
	Completed Transaction
T1 Debiting Money => 5000
	Processing Transaction
	Current Account Balance ==> 6000
	Completed Transaction
T2 Debiting Money => 2000
	Processing Transaction
	Current Account Balance ==> 4000
	Completed Transaction
Ending Transactions


T2 Credit opetation is skippd because the lock was aquired by T1
T2 Credit opetation is skippd because the lock was aquired by T1
*/
