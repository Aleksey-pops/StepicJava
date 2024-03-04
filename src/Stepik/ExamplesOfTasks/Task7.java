package Stepik.ExamplesOfTasks;

//import java.util.Scanner;
//
//public class Task7 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите секунды: ");
//        int sec = scan.nextInt();
//        int sec1 = sec % 60;
//        System.out.println(sec1);
//        int mun = sec / 60 % 60;
//        System.out.println(mun);
//        int hour = sec / 60 / 60 % 60;
//        System.out.println(hour);
//        System.out.println(hour + " часов " + mun + " минут " + sec1 + " секунд");
//    }
//}
import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        int sec;
        Scanner scan = new Scanner(System.in);
        sec = scan.nextInt();
        int hours, min;
        hours = sec / 3600;
        System.out.println(hours);
        sec = sec % 3600;
        System.out.println(sec);
        min = sec / 60;
        System.out.println(min);
        sec = sec % 60;
        System.out.println(sec);
        System.out.printf("%d часов %d минут %d секунд", hours, min, sec);
    }
}