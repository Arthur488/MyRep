package Streams.Methods;

import java.util.*;
import java.util.stream.Collectors;


public class Map_Method {
    public static void main(String[] args) {
        List <String> list = new ArrayList <>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }


        List <Integer> integerList = list.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(integerList);

        int[] ints = {5, 9, 3, 8, 1};

        ints = Arrays.stream(ints).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();


        System.out.println(Arrays.toString(ints));

        Set <String> set = new TreeSet <>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);

        Set <Integer> integerSet = set.stream().map(String::length).collect(Collectors.toSet());
        System.out.println(integerSet);
    }


}
