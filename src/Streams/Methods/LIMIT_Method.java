package Streams.Methods;

import Lambda_Expressions.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LIMIT_Method {
    public static void main(String[] args) {
        Student st1 = new Student("Arthur", 'm', 20, 3, 9.2);
        Student st2 = new Student("Kirill", 'm', 29, 2, 7.1);
        Student st3 = new Student("Elena", 'f', 26, 3, 6.5);
        Student st4 = new Student("Andrei", 'm', 23, 5, 10.4);
        Student st5 = new Student("Igor", 'm', 32, 4, 8.7);
        Student st6 = new Student("Kate", 'f', 29, 5, 9.7);
        Student st7 = new Student("Vika", 'f', 22, 1, 6.3);

        List<Student> studentList = List.of(st1, st2, st3, st4, st5, st6, st7);

        System.out.println("/-----3-----/");
        studentList.stream().filter(student -> student.getSex() == 'f').forEach(System.out::println);
        System.out.println("/-----2-----/");
        studentList.stream().filter(student -> student.getSex() == 'f').limit(2).forEach(System.out::println);
    }
}
