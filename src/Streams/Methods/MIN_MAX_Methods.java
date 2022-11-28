package Streams.Methods;

import Lambda_Expressions.Student;

import java.util.Comparator;
import java.util.List;

public class MIN_MAX_Methods {
    public static void main(String[] args) {
        Student st1 = new Student("Arthur", 'm', 20, 3, 9.2);
        Student st2 = new Student("Kirill", 'm', 29, 2, 7.1);
        Student st3 = new Student("Elena", 'f', 26, 3, 6.5);
        Student st4 = new Student("Andrei", 'm', 23, 5, 10.4);
        Student st5 = new Student("Igor", 'm', 32, 4, 8.7);
        Student st6 = new Student("Kate", 'f', 29, 5, 9.7);
        Student st7 = new Student("Vika", 'f', 22, 1, 6.3);
        List <Student> students = List.of(st1, st2, st3, st4, st5, st6, st7);

        Student student1 = students.stream().min(Comparator.comparingInt(Student::getAge)).get();
        System.out.println("Student by min: " + student1);

        Student student2 = students.stream().max(Comparator.comparingInt(Student::getAge)).get();
        System.out.println("Student by max: " + student2);

        Student student3 = students.stream().map(stud3 -> {
            stud3.setName(stud3.getName().toUpperCase());
            return stud3;
        }).filter(student -> student.getSex() == 'f').sorted(Comparator.comparingInt(Student::getAge)).min(Comparator.comparingInt(Student::getCourse)).get();
        System.out.println("Student by min mixed: " + student3);
    }
}
