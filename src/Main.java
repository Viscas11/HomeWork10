import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void checkLeapYear (int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) ;
            System.out.println(year + " год - высокосный год");
        } else {
            System.out.println(year + " год - невисокосный год ");
        }
    }
    public static void installClients (int clientOS , int clientDeviceYear) {
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
    public static int calculationDay (int deliveryDistance) {
        if (deliveryDistance < 20) return 1;
        else if (deliveryDistance < 60) return 2;
        else if (deliveryDistance <= 100) return 3;
        else return -1;
    }
        public static void main (String[]args) {
            task1();
            task2();
            task3();
        }
           public static void task1(){
            System.out.println("Задача 1");
            int year = 2021;
               checkLeapYear (year);
    }
           public static void task2(){
               System.out.println("Задача 2");
               int clientOS = 1;
               int clientDeviceYear = LocalDate.now().getYear();
             installClients(clientOS, clientDeviceYear );
    }
           public static void task3() {
               System.out.println("Задача 3");
               int deliveryDistance = 95;
               int days = calculationDay(deliveryDistance);
               if(days > 0)
                   System.out.println(" Потребуется дней: " + days);
               else System.out.println("Доставки нет");
           }
}