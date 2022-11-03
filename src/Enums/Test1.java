package Enums;

public class Test1 {
    void method(String daysOfWeek){
        System.out.println("Today is: " + daysOfWeek);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.method("Monday");
    }
}
