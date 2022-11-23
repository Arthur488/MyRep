package Lambda_Expressions.java.util.function_Interfaces.LambdasMethods;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List <String> list = List.of("privet", "kak dela?", "normalno", "poka");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

        ArrayList <Integer> integerArrayList = new ArrayList <>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.forEach(integer -> {
            System.out.println(integer);
            integer *= 2;
            System.out.println(integer);
        });
        System.out.println("/////////////////////////");
        integerArrayList.forEach(System.out::println);
        System.out.println("/////////////////////////");
        integerArrayList.forEach(integer -> {
            System.out.println(integer + " ");
        });

    }
}
