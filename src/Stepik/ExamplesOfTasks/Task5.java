package Stepik.ExamplesOfTasks;

import java.util.Scanner;

/*
Пользователь вводит с клавиатуры денежную сумму в рублях и копейках
(рубли и копейки вводятся в разные переменные).
Программа должна откорректировать введенную сумму в правильную форму.
Например, если пользователь ввел 22 и 978 , то программа должна вывести 31 р. 78 к.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество рублей: ");
        int rubles = scan.nextInt();
        System.out.println("Введите количество копеек: ");
        int pennies = scan.nextInt();
        int sum = rubles * 100 + pennies;
        System.out.println(sum / 100);
        System.out.println(sum % 100);
        System.out.println(sum / 100 + " р. " + sum % 100 + " к.");
//        System.out.printf("%02d р. %02d к.",sum1,sum);//выводится: 03 руб. 00 коп.
    }
}
