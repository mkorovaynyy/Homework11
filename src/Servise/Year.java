package Servise;

public class Year {

    public static void toDetermineYear(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
}
