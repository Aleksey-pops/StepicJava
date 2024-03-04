package Stepik.ExamplesOfTasks;

import java.sql.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
В отделе работают 3 сотрудника, которые получают заработную плату в рублях.
Требуется определить, на сколько зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого.
Пользователь вводит три целых числа (три зарплаты в рублях). Программа выводит разность зарплат в рублях.

Используйте тернарную операцию!

Тестовые данные
Sample Input:

6000 12000 10500
Sample Output:

6000
 */
public class Task6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int worker1 = scan.nextInt();
        int worker2 = scan.nextInt();
        int worker3 = scan.nextInt();
        int max = worker1 > worker2 ? worker1 : worker2;
        max = worker3 > max ? worker3 : max;
        int min = (worker1 > worker2) ? worker2 : worker1;
        min = (min > worker3) ? worker3 : min;
        System.out.println(max - min);
//        System.out.println((c1>c2)?c1:c2);
    }
}


