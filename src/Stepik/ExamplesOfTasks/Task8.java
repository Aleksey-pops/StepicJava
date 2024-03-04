package Stepik.ExamplesOfTasks;

import java.util.Scanner;

/*
Вычислите стоимость товара с учетом скидки.
Пользователь вводит цену товара в виде двух целых чисел через пробел (рубли копейки).
В следующей строке он вводит размер скидки в процентах (также целое число).
Цену нужно вывести так, как показано в тесте.

Учтите, что здесь не применяется округление по правилам математики.
Стоимость товара всегда учитывается в большую сторону.

При выводе число рублей и копеек выводится в двух позициях (т.е. 00 коп., если копеек нет)

Тестовые данные
Sample Input 1:

57 86
15
Sample Output 1:

49 руб. 19 коп.
Sample Input 2:

67 50
20
Sample Output 2:

54 руб. 00 коп.
 */
//public class Task8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a, b, c;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        int d = (a * 100 + b) * (100 - c) / 100 / 100;
//        int e = (int) Math.ceil((a * 100 + b) * (double) (100 - c) / 100 % 100);
//        System.out.print(d + " руб. ");
//        System.out.printf("%02d", e);
//        System.out.println(" коп.");
//    }
//}

// Второе решение

class Task8 {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int rub = sc.nextInt();
        int kop = sc.nextInt();
        int dis = sc.nextInt();
        int sumKop = rub * 100 + kop;
        sumKop -= sumKop * dis / 100;
//        System.out.println(sumKop);
        System.out.printf("%d руб. %02d коп.", sumKop / 100, sumKop % 100);
    }
}
