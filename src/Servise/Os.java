package Servise;

public class Os {

    public static void printTapeOS(int year, int typeOs) {
        switch (typeOs) {
            case 0:
                if(year < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите полную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if(year < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите полную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Тип операционной системы введен некорректно");
                break;
        }
    }
}
