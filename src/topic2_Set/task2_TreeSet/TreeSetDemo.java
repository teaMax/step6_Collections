package topic2_Set.task2_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(20);

        System.out.println(treeSet);
    }
}
