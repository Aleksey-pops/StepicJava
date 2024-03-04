package Stepik.ExamplesOfTasks;

import java.util.Scanner;

public class Task4 {
//    Пример 4. Зарплата менеджера составляет 100 $ плюс 5% от продаж.
//    Пользователь вводит общую сумму сделок менеджера за месяц (в долларах).
//    Определить итоговую зарплату менеджера в долларах (используйте целые числа).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = sc.nextInt();
        final int BASA = 100;
        final int PROCENT = 5;

        int salary = BASA + summa * PROCENT / 100;
        System.out.println(salary);
    }
}

