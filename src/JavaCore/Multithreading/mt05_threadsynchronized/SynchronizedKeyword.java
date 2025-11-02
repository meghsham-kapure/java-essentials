package JavaCore.Multithreading.mt05_threadsynchronized;

class BankAccount{

    private long bankBalance = 10000;

    public long getBankBalance(){
        return bankBalance;
    }

    public synchronized void creditBankBalance(int amount){
        bankBalance = bankBalance + amount;
        try {
            Thread.sleep( 5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void debitBankBalance(int amount){
        bankBalance = bankBalance - amount;
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class SynchronizedKeyword {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println("Before Transactions bank account has balance : "+bankAccount.getBankBalance());


        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" : Trying to Credit Rs. 700");
            bankAccount.creditBankBalance(700);
            System.out.println(Thread.currentThread().getName()+" : Credited Rs. 700");
        }) ;

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" : Trying to Debit Rs. 300");
            bankAccount.debitBankBalance(300);
            System.out.println(Thread.currentThread().getName()+" : Debited Rs. 300");
        }) ;

        Thread t3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" : Trying to Credit Rs. 900");
            bankAccount.creditBankBalance(900);
            System.out.println(Thread.currentThread().getName()+" : Credited Rs. 900");
        }) ;

        Thread t4 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" : Trying to Debit Rs. 1000");
            bankAccount.debitBankBalance(1000);
            System.out.println(Thread.currentThread().getName()+" : Debited Rs. 1000");
        }) ;

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("After Transactions bank account has balance : "+bankAccount.getBankBalance());

    }


}
