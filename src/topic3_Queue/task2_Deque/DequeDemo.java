package topic3_Queue.task2_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(20);
        deque.addFirst(300);
        System.out.println(deque);

        deque.addLast(-1);
        deque.addLast(-20);
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

        for(Integer elem : deque) {
            System.out.println(elem);
        }
    }
}
