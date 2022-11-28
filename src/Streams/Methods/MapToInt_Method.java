package Streams.Methods;

import Lambda_Expressions.Student;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToInt_Method {
    public static void main(String[] args) {
        Student st1 = new Student("Arthur", 'm', 20, 3, 9.2);
        Student st2 = new Student("Kirill", 'm', 29, 2, 7.1);
        Student st3 = new Student("Elena", 'f', 26, 3, 6.5);
        Student st4 = new Student("Andrei", 'm', 23, 5, 10.4);
        Student st5 = new Student("Igor", 'm', 32, 4, 8.7);
        Student st6 = new Student("Kate", 'f', 29, 5, 9.7);
        Student st7 = new Student("Vika", 'f', 22, 1, 6.3);

        List<Student> studentList = List.of(st1, st2, st3, st4, st5, st6, st7);

        List<Integer> courses = studentList.stream().mapToInt(Student::getCourse).boxed().toList();
        System.out.println(courses);

        int sumOfAges = studentList.stream().mapToInt(Student::getAge).sum();
        //OptionalInt minOfCourse = studentList.stream().mapToInt(Student::getCourse).min();
        int minOfCourse = studentList.stream().mapToInt(Student::getCourse).min().getAsInt();
        //OptionalDouble maxOfAverageGrade = studentList.stream().mapToDouble(Student::getAverageGrade).max();
        double maxOfAverageGrade = studentList.stream().mapToDouble(Student::getAverageGrade).max().getAsDouble();
        System.out.println("Sum of ages: " + sumOfAges);
        System.out.println("Min of courses: " + minOfCourse);
        System.out.println("Max of average grade: " + maxOfAverageGrade);
    }
}
