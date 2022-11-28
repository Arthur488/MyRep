package Streams.Methods;

import Lambda_Expressions.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingBy_partitioningBy_Methods {
    public static void main(String[] args) {
        Student st1 = new Student("Arthur", 'm', 20, 3, 9.2);
        Student st2 = new Student("Kirill", 'm', 29, 2, 7.1);
        Student st3 = new Student("Elena", 'f', 26, 3, 6.5);
        Student st4 = new Student("Andrei", 'm', 23, 5, 10.4);
        Student st5 = new Student("Igor", 'm', 32, 4, 8.7);
        Student st6 = new Student("Kate", 'f', 29, 5, 9.7);
        Student st7 = new Student("Vika", 'f', 22, 1, 6.3);
        ArrayList <Student> students = new ArrayList <>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);


        Map <Integer, List<Student>> map = students.stream().map(student -> {
            student.setName(student.getName().toUpperCase());
            return student;
        }).collect(Collectors.groupingBy(student -> student.getCourse()));

        for (Map.Entry <Integer, List<Student>> listMap: map.entrySet()){
            System.out.println(listMap.getKey() + ": " + listMap.getValue().toString());
        }

        System.out.println("/////////////////////////////////////////");

        Map <Boolean, List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(o -> o.averageGrade > 7));
        for (Map.Entry <Boolean, List<Student>> listMap2: map2.entrySet()){
            System.out.println(listMap2.getKey() + ": " + listMap2.getValue().toString());
        }

    }
}




























































