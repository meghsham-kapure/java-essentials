package JavaCore.CollectionFreamework.Vector;

import java.util.List;
import java.util.Vector;

public class ArrayListWthThreads {
    public static void main(String[] args) {
        List <Integer> numberList = new Vector<>();
        
        Thread thread1 = new Thread (()-> {
            for (int i = 0; i < 10000; i++) {
                numberList.add(i);
                System.out.print(numberList.get(i)+"  ");
            }
        });

        Thread thread2 = new Thread (()-> {
            for (int i = 0; i < 10000; i++) {
                numberList.add(i*100);
                System.out.print(numberList.get(i)+"  ");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

            //join() is for pause the main, method and letting the child method thread1 and thread2 complete first
            // with simply means the let thread1 and thrad2 add elements, when its complete then main method will resume print the count of array list size.
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n"+numberList);
        System.out.println(numberList.size());
    }
}
