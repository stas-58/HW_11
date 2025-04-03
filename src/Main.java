import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        leapYear();
    }

    public static void leapYear() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год и нажмите 'Enter'");
        int year = console.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        System.out.println("_____");
        System.out.println(" ");

        System.out.println("Задача 2");
        int clientDeviceYear = 0;
        int clientOS = 0;
        smartPhone(clientDeviceYear, clientOS);

    }

    public static void smartPhone(int clientDeviceYear, int clientOS) {
        int iOS = 0;
        int anDroid = 1;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число '0', если у Вас смартфон Apple или '1', если у Вас смартфон на Android и нажмите 'Enter'");
        clientOS = console.nextInt();
        System.out.println("Введите год выпуска Вашего телефона и нажмите 'Enter'");
        clientDeviceYear = console.nextInt();
        int currentYear = LocalDate.now().getYear();
        if (clientOS == iOS && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == iOS && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == anDroid && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("_____");
        System.out.println(" ");

        System.out.println("Задача 3");
        int deliveryTime = 1;
        numberOfDeliveryDays(deliveryTime);
    }

    public static int numberOfDeliveryDays(int deliveryTime) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите расстояние до дома клиента и нажмите 'Enter'");
        int deliveryDistance = console.nextInt();
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Для доставки потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Для доставки потребуется дней: " + deliveryTime);
        }
        return deliveryDistance;
    }
}