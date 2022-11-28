package Streams.Methods;

import java.util.Arrays;
import java.util.Comparator;

public class Sorted_Method {
    public static void main(String[] args) {
        int[] ints = {5, 7, 1, 2, 9, 0, 2, 7, 3};
//        Arrays_.sort(ints);
//        System.out.println(Arrays_.toString(ints));

        ints = Arrays.stream(ints).sorted().toArray();
        System.out.println(Arrays.toString(ints));
    }
}
