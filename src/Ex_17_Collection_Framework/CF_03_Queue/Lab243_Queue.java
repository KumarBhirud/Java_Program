package Ex_17_Collection_Framework.CF_03_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab243_Queue {
    // Queue -> 0.001% in Automation
    // FIFO
    static void main(String[] args) {

        PriorityQueue q=new PriorityQueue();
        q.add("Kumar");
        q.add("Bhirud");
        q.add("Akash");
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);
    }
}
