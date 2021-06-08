package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> values = createDummyData();

        long startTime = System.nanoTime();
        long count = values.parallelStream().sorted().count();
        long endTime = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.printf("parallel sort took: %d ms%n", millis);

        Supplier<Stream<String>> streamSupplier = () -> Stream.of("Java", "C++", "C#")
                .filter(s -> s.startsWith("J"));
    }

    public static List<String> createDummyData(){
        int max = 1000000;
        List<String> list = new ArrayList<>(max);
        for (int i = 0; i< max; i++){
            UUID uuid = UUID.randomUUID();
            list.add(uuid.toString());
        }
        return list;
    }
}
