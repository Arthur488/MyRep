package Streams.Methods;

import Lambda_Expressions.Student;

import java.util.ArrayList;
import java.util.List;

public class flatMap_Method {
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
        System.out.println(students);

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied Mathematics");
        faculty1.addStudentToFaculty(st1);
        faculty1.addStudentToFaculty(st2);
        faculty1.addStudentToFaculty(st3);

        faculty2.addStudentToFaculty(st4);
        faculty2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList <>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(student -> System.out.println(student.name));
    }
}

class Faculty{
    String name;
    List <Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList <>();
    }

    public List <Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
    public void addStudentToFaculty(Student student){
        studentsOnFaculty.add(student);
    }
}