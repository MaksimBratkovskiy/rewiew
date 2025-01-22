package org.example.enumEx;

public class EnumTest {
    Day day;

    public EnumTest(Day day){this.day = day;}

    public void tellItLikeItIs() {
        switch (day){
            case MONDAY -> System.out.println("Monday is bad");
            case FRIDAY -> System.out.println("Friday are better");
            case SATURDAY, SUNDAY -> System.out.println("Weekend are best");
            default -> System.out.println("Midweek is so-so");
        }
    }

}
