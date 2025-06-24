

import java.util.PriorityQueue;
import java.util.Queue;


public class Priority_Queue_example {
    /*
     * ELEMENTS IN THE PRIORITY QUEUE ARE NOT SORTED(MEANS KONSE BHI POSITION PAE RAKHE HUA HOTE AHE)
     * BUT WHEN ELMENTS ARE REMOVED THEY ARE REMVED IN SORTED ORDER(PAR JAB ELMENTS NIKALENGE TAB WOHI ORDER MAE NIKALENGE JAISE QUEUE MAE DALE THE)
     * Queue (e.g., LinkedList): In a standard queue (like LinkedList), elements are inserted in the order you provide. 
     * 
     * INSERTION ORDER
     * This follows the FIFO (First In, First Out) principle, so the elements remain in the order they were inserted.
     * Queue<Integer> queue = new LinkedList<>();
     * PriorityQueue: In a PriorityQueue, elements are not stored in the order they were inserted. 
     * Instead, they are ordered based on their natural ordering (if they are Comparable like numbers) or by a custom comparator provided at the queue's construction.
     * PriorityQueue<Integer> pq = new PriorityQueue<>();
     * 
     * REMOVE 
     * Queue (e.g., LinkedList): In a standard queue (like LinkedList), elements are inserted in the order you provide.
     * This follows the FIFO (First In, First Out) principle, so the elements remain in the order they were inserted.
     * Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue); // Output: [1, 2, 3]
    *PriorityQueue: In a PriorityQueue, elements are not in the o rder they were inserted.
    * Instead, they are ordered based on their natural ordering (if they are Comparable like numbers) or by a custom comparator provided at the queue's construction.
    * Elements are removed based on their priority rather than the order they were inserted. By default, this means the smallest element (according to the natural ordering or a custom comparator) will be removed first.
    * PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        System.out.println(pq.poll()); // Output: 1
        System.out.println(pq.poll()); // Output: 2
        System.out.println(pq.poll()); // Output: 3
    *

    */
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(3);
        pq.add(0);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());


    }

}
