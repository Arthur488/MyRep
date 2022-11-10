package Collections.Set.SortedSet.NavigableSet.TreeSet;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExmpl2 {
    public static void main(String[] args) {
        TreeSet <Student> studentTreeSet = new TreeSet <>();
        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);
        studentTreeSet.add(st1);
        studentTreeSet.add(st2);
        studentTreeSet.add(st3);
        studentTreeSet.add(st4);
        studentTreeSet.add(st5);
        System.out.println(studentTreeSet);

        System.out.println(studentTreeSet.first());
        System.out.println(studentTreeSet.last());
        Student st6 = new Student("Oleg", 2);
        System.out.println(studentTreeSet.headSet(st6));
        System.out.println(studentTreeSet.tailSet(st6));
        Student st7 = new Student("Vitya", 4);
        System.out.println(studentTreeSet.subSet(st6, st7));
        System.out.println(st3.equals(st6));
        System.out.println(st3.hashCode() == st6.hashCode());
        System.out.println(st3.compareTo(st6));
    }
}

class Student implements Comparable <Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public int compareTo(Student st) {
        return this.course - st.course;
    }

    public String toString() {
        return "Name: " + name + ", course: " + course + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
