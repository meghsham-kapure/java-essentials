//package JavaCore.Multithreading.mt07_threadreentrantlocks;
//
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//class BankAccount{
//    private final Lock lock = new ReentrantLock();
//
//    private long bankBalance = 10000;
//
//    public long getBankBalance(){
//        return bankBalance;
//    }
//
//    public void setBankBalance(long  bankBalance){
//        this.bankBalance = bankBalance;
//    }
//
//    public void creditBankBalance(long amount){
//        System.out.println(Thread.currentThread().getName()+" : creditBankBalance() is called ");
//        try {
//            System.out.println(Thread.currentThread().getName()+" : Trying to Credit Amount to Bank Account");
//            if (lock.tryLock(10000, TimeUnit.MILLISECONDS)){
//                System.out.println(Thread.currentThread().getName()+" : Lock Acquired ");
//                if (amount>0){
//                    System.out.println(Thread.currentThread().getName()+" : Amount Validated ");
//                    try {
//                        System.out.println(Thread.currentThread().getName()+" : Credit Transaction in process ");
//                        Thread.sleep(2500);
//                        setBankBalance(getBankBalance()+amount);
//                        Thread.sleep(2500);
//                        System.out.println(Thread.currentThread().getName()+" : Amount Credited to Bank Account");
//                    }catch (Exception e) {
//                        System.out.println(Thread.currentThread().getName()+" : Transaction Error ");
//                        e.printStackTrace();
//                    }
//                    finally {
//                        System.out.println(Thread.currentThread().getName()+" : Lock Released ");
//                        lock.unlock();
//                    }
//                }
//                else {
//                    lock.unlock();
//                }
//            }else {
//                System.out.println(Thread.currentThread().getName()+" : Lock is unavailable");
//            }
//        } catch (Exception e) {
//            System.out.println(Thread.currentThread().getName()+" : Lock Error ");
//            e.printStackTrace();
//        }
//
//
//        System.out.println(Thread.currentThread().getName()+" : creditBankBalance() is exiting. ");
//    }
//    public void debitBankBalance(long amount){
//        System.out.println(Thread.currentThread().getName()+" : debitBankBalance() is called ");
//        try {
//            if (lock.tryLock(10000, TimeUnit.MILLISECONDS)){
//                if (amount<=getBankBalance()){
//                    try {
//                        System.out.println(Thread.currentThread().getName()+" : Trying to Debit Amount to Bank Account");
//                        Thread.sleep(2500);
//                        setBankBalance(getBankBalance()-amount);
//                        Thread.sleep(2500);
//                        System.out.println(Thread.currentThread().getName()+" : Amount Debited from Bank Account");
//                    }catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    finally {
//                        lock.unlock();
//                    }
//                }
//            }else {
//                System.out.println(Thread.currentThread().getName()+" : Lock is unavailable");}
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println(Thread.currentThread().getName()+" : debitBankBalance() is executed. ");
//    }
//
//}
//
//public class ManualLocks {
//
//    public static void main(String[] args) {
//
//        BankAccountSBI bankAccountSBI = new BankAccountSBI();
//
//        System.out.println(Thread.currentThread().getName() + " : Before Transactions bank account has balance : " + bankAccountSBI.getBankBalance());
//
//
//        Thread t1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " : Trying to Credit");
//            bankAccountSBI.creditBankBalance(700);
//            System.out.println(Thread.currentThread().getName() + " : Finished Trying to Crediting");
//        });
//
//        Thread t2 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " : Trying to Debit");
//            bankAccountSBI.debitBankBalance(300);
//            System.out.println(Thread.currentThread().getName() + " : Finished Trying to Debiting");
//        });
//
//        Thread t3 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " : Trying to Credit");
//            bankAccountSBI.creditBankBalance(900);
//            System.out.println(Thread.currentThread().getName() + " : Finished Trying to Crediting");
//        });
//
//        Thread t4 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " : Trying to Debit");
//            bankAccountSBI.debitBankBalance(1000);
//            System.out.println(Thread.currentThread().getName() + " : Finished Trying to Debiting");
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//            t4.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(Thread.currentThread().getName() + " : After Transactions bank account has balance : " + bankAccountSBI.getBankBalance());
//
//    }
//}
//
