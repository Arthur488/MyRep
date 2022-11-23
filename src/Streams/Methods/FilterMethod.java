package Streams.Methods;

import Lambda_Expressions.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMethod {
    public static void main(String[] args) {
        int[] ints = {3, 1, 9, 8, 3, 2, 5};
        List <Integer> integerList = List.of(3, 1, 9, 8, 3, 2, 5);

//        integerList.stream().filter(el -> el.compareTo(el));

        Student st1 = new Student("Arthur", 'm', 20, 3, 9.2);
        Student st2 = new Student("Kirill", 'm', 29, 2, 7.1);
        Student st3 = new Student("Elena", 'f', 26, 3, 6.5);
        Student st4 = new Student("Andrei", 'm', 23, 5, 10.4);
        Student st5 = new Student("Igor", 'm', 32, 4, 8.7);
        ArrayList <Student> students = new ArrayList <>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);

//        students = (ArrayList) (students.stream().filter(student -> student.age > 22 && student.averageGrade < 7.2).collect(Collectors.toList()));
//        System.out.println(students);

//        Stream <Student> studentStream = Stream.of(st1, st2, st3, st4, st5);
//        students = (ArrayList <Student>) studentStream.filter(student -> student.age > 22 && student.averageGrade < 7.2).collect(Collectors.toList());
//        System.out.println(students);

        System.out.println("/////////////////////////////////////////////////////");

        students = (ArrayList <Student>) students.stream().sorted(Comparator.comparingInt(o -> o.age)).collect(Collectors.toList());
        System.out.println(students);
    }
}
