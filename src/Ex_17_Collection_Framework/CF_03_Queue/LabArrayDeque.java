package Ex_17_Collection_Framework.CF_03_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class LabArrayDeque {

    static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        System.out.println(deck);

        System.out.println(deck);

        Iterator iterator= deck.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
