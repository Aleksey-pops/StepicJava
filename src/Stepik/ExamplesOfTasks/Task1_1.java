package Stepik.ExamplesOfTasks;

import java.util.Scanner;

public class Task1_1 {
//    В методах вывода (println(), print(), printf()) можно использовать не только переменные,
//    но и выражения. Такие выражения сначала вычисляются, а затем результат выводится на консоль.
//    Т.е. в нашем примере можно было написать короче:

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(number % 10);
        System.out.println(number / 10);
    }
}

