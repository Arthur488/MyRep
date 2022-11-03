package Enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();

        System.out.println(today.weekDay);
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.MONDAY;
        System.out.println(w1==w3);
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY));
        WeekDays w15= WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays{
    MONDAY("Bad"),
    TUESDAY("cool"),
    WEDNESDAY("Cool"),
    THURSDAY("Good"),
    FRIDAY("Fine"),
    SATURDAY("Good"),
    SUNDAY("Cool");

    private String mod;
    private WeekDays(String mood){
        this.mod = mood;
    }

    public String getMod(){
        return mod;
    }
}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

class Today{
    WeekDays weekDay;
    public Today(WeekDays weekday){
        this.weekDay = weekday;
    }

    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Idi na roboty");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Otdixai");
                break;
        }
        System.out.println("Nastroy v etot den: " + weekDay.getMod());
    }

}



