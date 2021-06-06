package Java8;

import java.util.*;
import java.util.stream.Stream;

public class ExampleJava7and8 {
    public static void main(String[] args) {
        List<String> list1 = createDummyData();
        List<String> list2 = createDummyData();
        sortUsingJava7(list1);
        System.out.println(list1);
        sortUsingJava8(list2);
        System.out.println(list2);

        Stream<String> data = list1.stream().filter(p -> !p.equals("C++"));
        data.forEach(System.out::println);


        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        languages.forEach(System.out::println);
        Runnable r2 = () -> System.out.println("Runnable 2");
        r2.run();
    }

    private static void sortUsingJava7(List<String> list){
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
    }

    private static void sortUsingJava8(List<String> list){
        //list.sort(Comparator.reverseOrder());
        list.sort(String::compareTo);
    }

    private static List<String> createDummyData(){
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("C#");
        list.add("PHP");
        list.add("JS");
        return list;
    }


}

