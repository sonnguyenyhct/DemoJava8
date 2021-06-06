package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMap {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Java");
        hmap.put(2, "Javascript");
        hmap.put(3, "PHP");
        hmap.put(4, "C#");
        hmap.put(5, "C++");

        // forEach to iterate and display each key and value pair of HashMap
        hmap.forEach((key, value) -> System.out.println(key + " - " + value));
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("d");
        list.add("c");
        list.stream().sorted().forEachOrdered(System.out::println);
    }
}
