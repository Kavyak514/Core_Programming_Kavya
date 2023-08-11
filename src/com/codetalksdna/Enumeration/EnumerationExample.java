package com.codetalksdna.Enumeration;

enum DaysOfTheWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class EnumerationExample {
    public static void main(String[] args) {
        DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.FRIDAY;
        if (daysOfTheWeek == DaysOfTheWeek.FRIDAY) {
            System.out.println("Yay it's almost Weekend..!");
        }
        for (DaysOfTheWeek daysOfTheWeek1 : DaysOfTheWeek.values()) {
            System.out.println(daysOfTheWeek1);
        }
    }
}
