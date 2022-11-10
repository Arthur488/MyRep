package Lambda_Expressions;

import java.util.ArrayList;

public class StudentInfo {
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
        System.out.println("PrintStudentsOverGrade");
        PrintStudentsOverGrade(students, 8);
        System.out.println("PrintStudentsUnderAge");
        PrintStudentsUnderAge(students, 25);
        System.out.println("PrintStudentsMixCondition");
        PrintStudentsMixCondition(students, 9, 25, 'm');
    }

    static void PrintStudentsOverGrade(ArrayList <Student> arrayList, double grade) {
        for (Student student : arrayList) {
            if (student.averageGrade > grade) {
                System.out.print(student);
            }
        }
    }

    static void PrintStudentsUnderAge(ArrayList <Student> arrayList, int age) {
        for (Student student : arrayList) {
            if (student.age < age) {
                System.out.print(student);
            }
        }
    }

    static void PrintStudentsMixCondition(ArrayList <Student> arrayList, double grade, int age, char sex) {
        for (Student student : arrayList) {
            if (student.age > age && student.averageGrade < grade && student.sex == sex) {
                System.out.print(student);
            }
        }
    }

}
