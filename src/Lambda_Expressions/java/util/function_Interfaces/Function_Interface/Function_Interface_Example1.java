package Lambda_Expressions.java.util.function_Interfaces.Function_Interface;

import Lambda_Expressions.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Function_Interface_Example1 {
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
        System.out.println(students);
        double average = 0;
        for (Student student : students) {
            average += student.course;
        }
        System.out.println(average / students.size());

        System.out.println(averageOfSmth(students, student -> student.averageGrade));
        System.out.println(averageOfSmth(students, student -> (double) student.age));
        System.out.println(averageOfSmth(students, student -> (double) student.course));

    }

    //О 10:00

    private static double averageOfSmth(List <Student> studentList, Function <Student, Double> function) {
        double result = 0;
        for (Student student : studentList) {
            result += function.apply(student);
        }
        result /= studentList.size();

        return result;
    }


}

//Саша
//        0974864612
