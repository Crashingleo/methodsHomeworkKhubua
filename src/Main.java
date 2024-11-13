import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void isIt(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Год " + year + " високосный");
        } else System.out.println("Год " + year + " не високосный");
    }
    public static void whatVersion (int device, int number){
        int currentYear = LocalDate.now().getYear();
        if(device == 0){
            if(number < currentYear){
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else System.out.println("Установите обычную версию приложения для IOS по ссылке");
        } else {
            if(number < currentYear){
                System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
            } else System.out.println("Установите обычную версию приложения для ANDROID по ссылке");
        }
    }
    public static int howManyDays (int km){
        int days = 1111;
        if(km <= 20){
            days = 1;
        }else if(km <= 60){
            days = 2;
        }else if(km <= 100){
            days = 3;
        } else days = 0;
        return days;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        System.out.println("Task 1");
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        isIt(year);
    }

    public static void task2() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите свою операционную систему: где 1 это Android, а 0 это IOS ");
        int system = console.nextInt();
        if (system == 1 || system == 0) {
            System.out.print("Введите год выпуска своего телефона -- ");
            int year = console.nextInt();
            whatVersion(system, year);
        } else {
            System.out.println("Неверная операционная система");
        }
    }
    public static void task3(){
        int distance = 200;
        int days = howManyDays(distance);
        if (days == 0){
            System.out.println("Доставки нет");
        } else System.out.println(days);
    }
}


