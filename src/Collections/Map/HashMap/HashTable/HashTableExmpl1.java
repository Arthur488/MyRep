package Collections.Map.HashMap.HashTable;

import Collections.Map.TreeMap.Student;

import java.util.Hashtable;

public class HashTableExmpl1 {
    public static void main(String[] args) {
        Hashtable <Double, Student> hashtable = new Hashtable <>();
        Student st1 = new Student("Arthur", "Rakhmankulov", 3);
        Student st2 = new Student("Mariya", "Sidorova", 4);
        Student st3 = new Student("Vova", "Petrov", 1);
        Student st4 = new Student("Vova", "Petrov", 4);
        Student st5 = new Student("Vofva", "Petdov", 3);
        Student st6 = new Student("Vitya", "Abramov", 1);
        Student st7 = new Student("Kate", "Viktorova", 5);
    }
}
