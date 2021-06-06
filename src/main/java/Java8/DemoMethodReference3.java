package Java8;

import java.util.Arrays;

public class DemoMethodReference3 {
    public static void main(String[] args) {
        String[] stringArray = {"Java", "C++", "PHP","C++", "JS"};

        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray){
            System.out.println(str);
        }
    }
}
