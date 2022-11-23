package Streams.Methods;

import java.util.Arrays;

public class forEach_Method {
    public static void main(String[] args) {
        int[] ints = {5, 9, 3, 8, 1};
        Arrays.stream(ints).forEach(value -> {
            value = value * 2;
            System.out.println(value);
        });
        System.out.println("--------------------------");
        Arrays.stream(ints).forEach(System.out::println);
        System.out.println("--------------------------");
        Arrays.stream(ints).forEach(Utils::myMethod);
        System.out.println("--------------------------");
        Arrays.stream(ints).forEach(value -> Utils.myMethod(value));

    }
}

class Utils {
    public static void myMethod(int a) {
        a += 5;
        System.out.println("Element = " + a);
    }
}
