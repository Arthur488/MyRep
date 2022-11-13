package Lambda_Expressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CleanExampleLambdaStudent {
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
        //System.out.println(students);

        Predicate <Student> ps1 = s -> s.age > 30;
        Predicate <Student> ps2 = s -> s.sex == 'm';
        Predicate <Student> ps3 = s -> s.name.startsWith("A");

        testStudents(students, ps2.negate());
        System.out.println("-------------------------------");
        testStudents(students, ps1.and(ps2));
        System.out.println("-------------------------------");
        testStudents(students, ps1.and(ps2).or(ps3));
        System.out.println("-------------------------------");
        testStudents(students, (s) -> s.name.startsWith("A"));
        System.out.println("-------------------------------");
        testStudents(students, (s) -> s.averageGrade >= 8 && s.averageGrade <= 10);
        System.out.println("-------------------------------");


    }

    static void testStudents(ArrayList <Student> arrayList, Predicate <Student> filter) {
        for (Student student : arrayList) {
            if (filter.test(student)) {
                System.out.print(student);
            }
        }
    }
}
