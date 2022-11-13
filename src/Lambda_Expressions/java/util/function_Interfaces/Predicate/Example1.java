package Lambda_Expressions.java.util.function_Interfaces.Predicate;

import Lambda_Expressions.Student;
import Lambda_Expressions.StudentInfo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
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

        testStudents(students, student -> student.course > 3);

    }

    static void testStudents(ArrayList <Student> students, Predicate <Student> studentPredicate) {
        for (Student student : students) {
            if (studentPredicate.test(student)) {
                System.out.print(student);
            }
        }
    }
}
