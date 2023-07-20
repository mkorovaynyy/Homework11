import Servise.Delivery;
import Servise.Os;
import Servise.Year;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача1");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Веедите год - год должен быть типа int и положительным");
        int year = scanner1.nextInt();
        Year.toDetermineYear(year);

    }

    public static void task2() {
        System.out.println("Задача2");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите тип операционной системы: 0 - iOS, 1 — Android");
        int typeOs = scanner2.nextInt();
        System.out.println("Введите год выпуска устройства");
        int year = scanner2.nextInt();
        Os.printTapeOS(year, typeOs);


    }

    public static int task3() {
        System.out.println("Задача3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние до адерса доставки");
        int distance = scanner.nextInt();
        return Delivery.calculateDeliveryDay(distance);
    }
}