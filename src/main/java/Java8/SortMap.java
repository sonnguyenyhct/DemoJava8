package Java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(44, "Four");
        map.put(22, "Two");
        map.put(33, "Three");
        map.put(55, "Five");
        map.put(11, "One");

        Map<Integer,String> sortedMapByKey = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey())
                .forEachOrdered(e -> sortedMapByKey.put(e.getKey(),e.getValue()));
        System.out.println(sortedMapByKey);

    }
}
