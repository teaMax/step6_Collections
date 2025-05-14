package topic1_List.task4_ArrayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(42);
        arrayList.add(17);
        arrayList.add(8);
        arrayList.add(99);
        arrayList.add(23);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
