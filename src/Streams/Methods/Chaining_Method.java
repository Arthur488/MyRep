package Streams.Methods;

import Lambda_Expressions.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chaining_Method {
    public static void main(String[] args) {
        //FirstExample.firstExample();
        //SecondExample.secondExample();
        ThirdExample.thirdExample();
    }
}

class FirstExample{
    public static void firstExample(){
        System.out.println("FIRST EXAMPLE ON METHOD CHAINING\n");
        int[] array = {3, 8, 3, 4, 1, 9, 0, 14, 3, 6, 7, 1};

        int result = Arrays.stream(array).filter(value -> value%2 == 1).map(el->{
            if(el % 3 ==0){
                el /= 3;
            }
            return el;
        }).reduce((acc, elem)-> acc + elem).getAsInt();

        //3 3 1 9 3 7 1
        //3 3 9 3
        //1 1 1 3 1 7 1

        System.out.println(result);
    }
}

class SecondExample{
    public static void secondExample(){
        System.out.println("SECOND EXAMPLE ON METHOD CHAINING\n");

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

        System.out.println("//////////////////////////////////");
       students.stream().map(student -> {
            student.name = student.name.toUpperCase();
            return student;
        }).filter(student -> student.sex == 'f').sorted((o1, o2) -> o1.age- o2.age).forEach(System.out::print);

    }
}

class ThirdExample{
    public static void thirdExample(){
        Stream <Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream.filter(el->{
            System.out.println("!!!");
            return el%2==0;
        }).collect(Collectors.toList());
    }
}
















