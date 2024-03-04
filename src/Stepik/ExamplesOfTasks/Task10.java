package Stepik.ExamplesOfTasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // локализуем английский ввод цифры через точку
        double a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите аргумент: ");
        a = scan.nextDouble();
        double z = 2 * pow(sin(3 * PI - 2 * a), 2) * pow(cos(5 * PI + 2 * a), 2);
        double y = .25 - .25 * sin(2.5 * PI - 8 * a);
        System.out.printf("%.5f %.5f", z, y);
    }
}
