package Stepik.ExamplesOfTasks;

import java.util.Scanner;

public class Task1 {
//    Пример 1. Ввести двузначное положительное целое число. Вывести его последнюю и первую цифры.

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();

            int lastDigit = number % 10; //последняя цифра
            int firstDigit = number / 10; //первая цифра, поскольку число двузначное

            System.out.println(lastDigit);
            System.out.println(firstDigit);
        }
    }