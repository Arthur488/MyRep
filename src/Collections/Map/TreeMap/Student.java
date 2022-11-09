package Collections.Map.TreeMap;

public class Student implements Comparable <Student> {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}' + "\n";
    }

    @Override
    public int compareTo(Student o) {
        //return this.course - o.course;
        return this.name.compareTo(o.name);
    }
}
