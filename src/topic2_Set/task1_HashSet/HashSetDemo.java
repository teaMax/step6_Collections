package topic2_Set.task1_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Tomato");
        set.add("Apple");

        for(String fruit : set) {
            System.out.println(fruit);
        }
    }
}
