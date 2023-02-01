package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestWildcards {
    public static void main(String[] args) {
        List <Integer> integers = List.of(1, 2, 3, 4, 5);
        List <Float> floats = List.of(1.1F, 2.5F, 3.57F, 40.312F);
        List <Double> doubles = List.of(16745.134, 13453.0987, 2343546.423546);
        List <String> strings = List.of("Arthur", "Privet", "Poka");

        printList(integers);
        printList(floats);
        printList(doubles);
        printList(strings);

        ArrayList<Double> list = new ArrayList <>();
        list.add(145D);
        list.add(111D);

        sum(list);
    }

    public static void printList(List <?> list){
        System.out.println("My list has elements---> " + list);
    }

    public static void sum(ArrayList<? extends Number> arrayList){
        double sum = 0;
        for (Number number: arrayList) {
            sum+=number.doubleValue();
        }
        System.out.println(sum);
    }
}
