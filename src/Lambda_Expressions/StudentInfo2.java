package Lambda_Expressions;

import java.util.ArrayList;

public class StudentInfo2 {
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
        StudentInfo2 studentInfo2 = new StudentInfo2();

//        studentInfo2.testStudents(students, new CheckOverGrade());

//        System.out.println("-------------------------------");
//        studentInfo2.testStudents(students, new StudentCheck() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });

        System.out.println("-------------------------------");
        studentInfo2.testStudents(students, (Student s) -> {
            return s.age > 30;
        });
        System.out.println("-------------------------------");
        studentInfo2.testStudents(students, (s) -> s.age > 30 && s.sex == 'm');

    }

//    void testStudents(ArrayList <Student> arrayList, StudentCheck filter) {
//        for (Student student : arrayList) {
//            if (filter.check(student)) {
//                System.out.print(student);
//            }
//        }
//    }

    void testStudents(ArrayList <Student> arrayList, StudentCheck filter) {
        for (Student student : arrayList) {
            if (filter.check(student)) {
                System.out.print(student);
            }
        }
    }
}

interface StudentCheck {
    boolean check(Student s);
}

class CheckOverGrade implements StudentCheck {

    @Override
    public boolean check(Student s) {
        return s.averageGrade > 8;
    }
}
