package MultiThreadViblo;


import javafx.application.Application;

import java.util.stream.IntStream;

public class MutualExclusion {

    private static int COUNTER = 0;

    public static void main(String... args) throws Exception {

        final Runnable increaseCounterFunc = () -> IntStream
                .range(0, 100)
                .forEach(MutualExclusion::increaseCounter);

        final Thread first = new Thread(increaseCounterFunc);
        final Thread second = new Thread(increaseCounterFunc);

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(COUNTER);
    }

    private static void increaseCounter(int i) {
        ++COUNTER;
    }
}
