package QUEUE;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QUEUES {
    public static void main(String[] args) {
        //ON LEFT SIDE WE HAVE IMPLEMENTATION AND RIGHT SIDE WE HAVE INTERFACE TYPE
        //WE CAN ALSO WRITE Queue<Integer> queue=new LinkedList<Integer>()
        //as Linkedlist is class that implements Queue interface
        //Interface: Queue<Integer> is the interface type, which defines the contract (methods) that any queue-like collection must implement.
        //Implementation: new LinkedList<>() is the concrete class that provides the actual implementation of the Queue interface.
        Queue<Integer> queue=new LinkedList<>();
        
        //INSERT ELEMENT FROM TAIL SIDE
        queue.add(1);
        //queue.add(11);
        // queue.add(12);
        // queue.add(13);
        queue.offer(2);
        ArrayUtility.show(queue);

        //TO SEE HEAD ELEMET IN QUEUE
        System.out.println(queue.peek());
        System.out.println(queue.element());
        ArrayUtility.show(queue);

        //REMOVE ELEMENT FROM HEAD SIDE OF THE QUEUE
        //PERMANENTLY REMOVES ELEMENT
        queue.remove();
        ArrayUtility.show(queue);
        queue.poll();
        ArrayUtility.show(queue);

        //GIVES EXCEPTION AS QUEUE IS EMPTY
        //System.out.println(queue.remove());

        
        //GIVES NULL AS QUEUE IS EMPTY
        System.out.println(queue.poll());


        //By default, a PriorityQueue orders elements in their "natural" order (e.g., numbers in ascending order, strings in alphabetical order).
        //When you want the elements to be ordered differently from their natural order, you need a custom comparator. WHEN U GIVE CLASS SUCH AS STUDENTS TAT HAS GRADES AND NAME
        Queue<Integer> values=new PriorityQueue<>();
        values.add(100);
        values.add(1);
        values.add(2);
        values.add(0);
        System.out.println(values);
        

        
        //BASICALLY WE ARE PASING CHILD OBJECT
        //AS PriorityQueue IMPLELEMETNS QUEUEINTERFACE THAT IS QUEUEINTERFACE IS PARENT AND PriorityQueue IS CHILD
        //QUEUEINTERFACE IMPLELEMETNS COLLECTION INTERFACE THUS COLLECTION INTERFACEIS PARENT 
        //DISPLY THE QUEUE
        //ArrayUtility.show(queue);



    }
}
