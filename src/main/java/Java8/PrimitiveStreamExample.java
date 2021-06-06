package Java8;

import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        IntStream.range(1,6).forEach(System.out::println);
    }
}
