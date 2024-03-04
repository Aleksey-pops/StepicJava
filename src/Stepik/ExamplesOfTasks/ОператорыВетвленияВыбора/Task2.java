package Stepik.ExamplesOfTasks.ОператорыВетвленияВыбора;

import java.util.Scanner;

/*
        Пример 2. Пользователь вводит номер дня недели.
        Программа должна вывести название этого дня или сообщить о том,
        что в неделе всего 7 дней.
*/
public class Task2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели: ");
        number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("В неделе всего семь дней!");
        }
    }
}
