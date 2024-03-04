package Stepik.ExamplesOfTasks;

import java.util.Locale;
import java.util.Scanner;

/*
Напишите программу, которая вычисляет значение функции


При выводе значение функции представьте с четырьмя знаками после десятичной точки.

Тестовые данные
Sample Input:

3.45
Sample Output:

4.4738
 */
public class Task9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // локализуем английский ввод цифры через точку
        double x, y = 0;
        Scanner scan = new Scanner(System.in);
//        System.out.print();
        x = scan.nextDouble();
        y = Math.log(x + 7 * Math.sqrt(Math.pow(x, 4) + Math.PI));
        System.out.println("Значение функции= " + y);
        System.out.printf("%.4f", y); //вывод форматированный 4 цифр после запятой
    }
}
