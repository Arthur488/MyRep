package Collections.Map.TreeMap;

import java.util.TreeMap;

public class TreeMapExmpl1 {
    public static void main(String[] args) {
        TreeMap <Double, Student> treeMap = new TreeMap <Double, Student>();
        Student st1 = new Student("Arthur", "Rakhmankulov", 3);
        Student st2 = new Student("Mariya", "Sidorova", 4);
        Student st3 = new Student("Vova", "Petrov", 1);
        Student st4 = new Student("Vova", "Petrov", 4);
        Student st5 = new Student("Vofva", "Petdov", 3);
        Student st6 = new Student("Vitya", "Abramov", 1);
        Student st7 = new Student("Kate", "Viktorova", 5);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(2.8, st3);
        treeMap.put(4.2, st4);
        treeMap.put(8.9, st5);
        treeMap.put(9.9, st6);
        treeMap.put(9.1, st7);


        System.out.println(treeMap);


//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.0));
//        System.out.println(treeMap.headMap(7.0));
//        System.out.println(treeMap.firstEntry());
//        System.out.println(treeMap.lastEntry());
    }
}


