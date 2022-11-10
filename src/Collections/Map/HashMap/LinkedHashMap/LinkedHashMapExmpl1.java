package Collections.Map.HashMap.LinkedHashMap;

import Collections.Map.TreeMap.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapExmpl1 {
    public static void main(String[] args) {
        LinkedHashMap <Double, Student> linkedHashMap = new LinkedHashMap <>(16, 0.75f, true);

        Student st1 = new Student("Arthur", "Rakhmankulov", 3);
        Student st2 = new Student("Mariya", "Sidorova", 4);
        Student st3 = new Student("Vova", "Petrov", 1);
        Student st4 = new Student("Vova", "Petrov", 4);
        Student st5 = new Student("Vofva", "Petdov", 3);
        Student st6 = new Student("Vitya", "Abramov", 1);
        Student st7 = new Student("Kate", "Viktorova", 5);

        linkedHashMap.put(6.4, st2);
        linkedHashMap.put(2.8, st3);
        linkedHashMap.put(4.2, st4);
        linkedHashMap.put(8.9, st5);
        linkedHashMap.put(9.9, st6);
        linkedHashMap.put(9.1, st7);
        linkedHashMap.put(null, st1);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(2.8));
        System.out.println(linkedHashMap.get(4.2));

        System.out.println(linkedHashMap);
    }
}
