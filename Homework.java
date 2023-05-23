import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        int Temperature1 = 100;
        int Temperature2 = 0;
        canWalk(isWeekend, isRain);
        canBuy(isEdekaOpen, isReweOpen);
        Temperature(Temperature1, Temperature2);

    }

    public static void canWalk(boolean isWeekend, boolean isRain) {
        System.out.println(isWeekend || isRain);

    }
    public static void canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        System.out.println(isEdekaOpen || isReweOpen);
    }
    public static void Temperature(int Temperature1, int Temperature2) {
        System.out.println(Temperature1 > Temperature2);
    }

}