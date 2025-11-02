package JavaCore.Multithreading.mt07_threadreentrantlocks;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Room {
    private Object room;
    Lock lock = new ReentrantLock();

    public void  getSleepInRoom(){
        System.out.println(Thread.currentThread().getName()+ " is trying to get room");
        try {
            if (lock.tryLock(900, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName()+ " is inside the room");
                try{
                    System.out.println(Thread.currentThread().getName()+ " is sleeping");
                    Thread.sleep(800);
                    System.out.println(Thread.currentThread().getName()+ " completed sleeping");

                }catch (InterruptedException iex){
                    iex.printStackTrace();
                }
                finally {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + " exiting room");
                }
            }else{
                System.out.println(Thread.currentThread().getName()+ " could not get room");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class P09_RoomLockExample {
    public static void main(String[] args) {
        Room room1 = new Room();

        Thread t1 = new Thread(()->{
            room1.getSleepInRoom();
        });

        Thread t2 = new Thread(()->{
            room1.getSleepInRoom();
        });

        t1.start();
        t2.start();
    }
}

