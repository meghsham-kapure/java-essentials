package JavaCore.CollectionFreamework.CF11_PriorityQueue;

/*

Implement a Queue Using LinkedList
    Write a program to create a Queue using the LinkedList class.
    Add five integers to the queue and then dequeue all elements while printing them.

*/

import java.util.LinkedList;
import java.util.Queue;

public class QueueWithLinedList {
    public static void main(String[] args) {
        Queue <Integer> queue= new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println("Added : " + queue);
        System.out.print("Removed : " );
        while (!queue.isEmpty())
            System.out.print(queue.remove()+" ");
        }
}
