package Stepik.ExamplesOfTasks.ОператорыВетвленияВыбора;

import java.util.Scanner;

/*
Пример 1. Программа подсчитывает размер ежегодного налога, который должен уплатить гражданин.
Пользователь вводит размер годового дохода в копейках (целое число, не больше 4 млрд. -
для олигархов эта программа не подходит!). Если доход не превышает 5 млн. рублей,
то начисляется 13% налога. Если превышает - то 15%.
 */
public class Task1 {

    public static void main(String[] args) {
        long income; //для ввода дохода <=4 млрд.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите годовой доход в копейках: ");
        income = scan.nextLong();
        double tax;
        if (income / 100 <= 5e6) {
            tax = income * 0.13;
        } else {
            tax = income * 0.15;
        }
        long taxLong = (long) Math.ceil(tax);
        System.out.println("Налог= " + taxLong / 100 + " руб. " + taxLong % 100 + " коп.");
    }
}
