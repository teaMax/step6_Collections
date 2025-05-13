package topic4_Map.task2_HashMapIter;

import java.util.HashMap;
import java.util.Map;

public class HashMapIter {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Alice", 85);
        students.put("Bob", 72);
        students.put("Charlie", 90);
        students.put("Diana", 68);

        System.out.println("Студенты с баллами выше 75: ");
        for(Map.Entry student : students.entrySet()) {
            if((int)student.getValue() > 75) System.out.println(student.getKey() + " : " + student.getValue());
        }
    }
}
