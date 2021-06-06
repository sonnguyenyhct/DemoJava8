package Java8;

import java.util.Arrays;
import java.util.List;

public class Java8Overview_Filter {

    public static void main(String[] args) {
        java8Lamda();
    }
    private static List<Integer> createDummyData(){
        return Arrays.asList(1,32,52,1,5,34,53,3,2,63);
    }
    public static void java8Lamda(){
        List<Integer> numbers = createDummyData();
        numbers.stream().sorted().filter(t -> t%2 !=0).forEach(t -> System.out.println(t + " "));
    }


}
