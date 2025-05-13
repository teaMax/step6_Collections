package topic4_Map.task1_HashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    private static Map<String, Integer> countOfFruits = new HashMap<>();

    public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        counter(array);
        for(Map.Entry elem : countOfFruits.entrySet()) {
            System.out.println(elem.getKey() + " : " + elem.getValue());
        }
    }

    private static void counter(String[] array){
        if(array.length == 0) {
            System.out.println("Массив пустой");
            return;
        }

        for(String elem : array) {
            if(countOfFruits.containsKey(elem)) {
                countOfFruits.put(elem, (countOfFruits.get(elem) + 1));
            } else {
                countOfFruits.put(elem, 1);
            }
        }
    }

}
