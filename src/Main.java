import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int checkLeapYear () {
        int year = 2021;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) ;
            System.out.println(year + " год - высокосный год");
        } else {
            System.out.println(year + " год - невисокосный год ");
        }
        return year;
    }
    public static void installClients () {
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        int IOS = 0;
        int Android = 1;
        if (clientOS == IOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == IOS && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");}
        if (clientOS == Android && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == Android && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
        public static void main (String[]args) {
            task1();
            task2();
        }
           public static void task1(){
            System.out.println("Задача 1");
            checkLeapYear();
    }
           public static void task2(){
               System.out.println("Задача 2");
             installClients();
           }
}