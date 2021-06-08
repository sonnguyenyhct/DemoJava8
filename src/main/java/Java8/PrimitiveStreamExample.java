package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        IntStream.range(1,6).forEach(System.out::println);
        // sorted() operation helps sort elements based on certain criteria
            List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

            // sorted according to natural order
            data.stream() //
                    .sorted() //
                    .forEach(System.out::println);

            // sorted according to the provided Comparator
            data.stream() //
                    .sorted((s1, s2) -> s1.length() - s2.length()) //
                    .forEach(System.out::println);
    }
}
