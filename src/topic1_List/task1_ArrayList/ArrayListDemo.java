package topic1_List.task1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        arrayList.remove(Integer.valueOf(20));

        for(Integer elem : arrayList) {
            System.out.println(elem);
        }
    }
}
