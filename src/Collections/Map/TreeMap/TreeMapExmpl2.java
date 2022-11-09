package Collections.Map.TreeMap;

import java.util.TreeMap;

public class TreeMapExmpl2 {
    public static void main(String[] args) {
        TreeMap <Student, Double> treeMap = new TreeMap <Student, Double>();
        Student st1 = new Student("Arthur", "Rakhmankulov", 3);
        Student st2 = new Student("Mariya", "Sidorova", 4);
        Student st3 = new Student("Vova", "Petrov", 1);
        Student st4 = new Student("Vova", "Petrov", 4);
        Student st5 = new Student("Vofva", "Petdov", 3);
        Student st6 = new Student("Vitya", "Abramov", 1);
        Student st7 = new Student("Kate", "Viktorova", 5);


        treeMap.put(st4, 4.2);
        treeMap.put(st5, 8.9);
        treeMap.put(st6, 9.9);
        treeMap.put(st7, 9.1);
        treeMap.put(st1, 5.8);
        treeMap.put(st2, 6.4);
        treeMap.put(st3, 2.8);

        Student st8 = new Student("Kate", "Viktorova", 5);

        System.out.println(treeMap.containsKey(st8));


//
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.0));
//        System.out.println(treeMap.headMap(7.0));
//        System.out.println(treeMap.firstEntry());
//        System.out.println(treeMap.lastEntry());
    }
}
