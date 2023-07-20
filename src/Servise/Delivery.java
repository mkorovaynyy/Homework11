package Servise;

public class Delivery {
    public static int calculateDeliveryDay (int distance) {
        int deliveruDay = 1;
        if(distance > 20) {
            deliveruDay++;
        } if (distance > 60) {
            deliveruDay++;
        } if (distance > 100) {
            deliveruDay = -1;
        }
        return deliveruDay;
    }
}
