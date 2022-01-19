package ru.lookBag;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1 задача

        checkLeapYear(2020);

        System.out.println();

        //2 задача

        int clientOS = 1;
        int clientDeviceYear = 2015;
        checkWhichOSInstall(clientOS, clientDeviceYear);

        System.out.println();

        //3 задача

        int distanceToClient = 70;
        System.out.println("Через " + countsDeliveryDays(distanceToClient) + " день(дня) вам оставят заказ");

        System.out.println();

        //4 задача

        String sortedString = "abccddefgghiijjkk";
        searchDuplicateInString(sortedString);

        System.out.println();

        //5 задача

        int[] justArray = {3, 2, 1, 6, 5};

        System.out.print("Массив до переворота: ");
        System.out.println(Arrays.toString(justArray));

        flipArray(justArray);

        System.out.print("Массив после переворота: ");
        System.out.println(Arrays.toString(justArray));

        System.out.println();

    }

    public static void checkLeapYear (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void checkWhichOSInstall(int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("К сожалению на данную OS нельзя установить приложение :(");
        }
    }

    public static int countsDeliveryDays(int distance){
        int daysForDelivery = 1;
        if (distance <= 20) {
            return daysForDelivery;
        } else{
            distance -= 20;
            for (int i = distance; i > 0; i -= 40) {
                daysForDelivery++;
            }
            return daysForDelivery;
        }
    }

    public static void searchDuplicateInString(String searchString) {
        char[] charArray = searchString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(i != charArray.length - 1) {
                if (charArray[i] == charArray[i + 1]){
                    System.out.println("Найден повторяющейся символ: " + charArray[i]);
                    System.out.println("Под индексами " + i + " и " + (i + 1));
                    break;
                }
            } else {
                System.out.println("В строке " + searchString + " нет дублей");
                break;
            }
        }
    }

    public static void flipArray(int[] array){
        int lastIndex = array.length - 1;
        int middleIndex = (array.length - 1) / 2;
        int storage;

        for (int i = 0; i <= middleIndex; i++) {
            storage = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = storage;
            lastIndex--;
        }

    }
}
