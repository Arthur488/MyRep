package Streams.Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_Method {
    public static void main(String[] args) {
        List <Integer> integerList = new ArrayList <>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(2);
        integerList.add(4);
        integerList.add(3);

        int res = integerList.stream().reduce(1, (acc, integer) -> acc * integer);
        System.out.println(res);

        List <String> stringList = new ArrayList <>();
        stringList.add("privet!");
        stringList.add("Kak dela?");
        stringList.add("OK");
        stringList.add("poka");
        String s = stringList.stream().reduce((s1, s2) -> s1 + s2).get();
        System.out.println(s);

//        int res = integerList.stream().reduce((acc, integer) -> acc * integer).get();
//        System.out.println(res);

//        List <Integer> list100 = new ArrayList <>();
//        Optional <Integer> o = list100.stream().reduce((acc, integer) -> acc * integer);
//
//        if (o.isPresent()) {
//            System.out.println(o);
//        } else {
//            System.out.println("NOT Present");
//        }

    }
}
