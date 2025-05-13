package topic1_List.task2_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();

        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");

        stringList.addFirst("Zero");
        stringList.addLast("Fourth");

        System.out.println(stringList);

        stringList.removeFirst();
        stringList.removeLast();

        for(String str : stringList) {
            System.out.println(str);
        }
    }
}
