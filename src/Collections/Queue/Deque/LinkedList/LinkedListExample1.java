package Collections.Queue.Deque.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

/*
 * IMPLEMENTS QUEUE
 *
 * */
public class LinkedListExample1 {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList <>();
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.add("Aleksandr");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        queue.add("Arthur");
        queue.offer("Viktor");
        System.out.println(queue);
    }
}
