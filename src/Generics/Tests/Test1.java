package Generics.Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <Integer> arrayInt = List.of(1, 2, 3);
        List <String> arrayString = List.of("Hello", "World");
        printArray(arrayInt);
        printArray(arrayString);
    }

    static <T> void printArray(List <T> List) {
        List.forEach(System.out::println);
    }
}
