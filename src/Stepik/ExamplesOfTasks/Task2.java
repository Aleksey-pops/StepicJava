package Stepik.ExamplesOfTasks;

import java.util.Scanner;

public class Task2 {
//    Пример 2. Пользователь вводит с клавиатуры объем флешки в гигабайтах.
//    Подсчитать,  сколько на нее поместиться фильмов со средним размером 760 Mб и
//    музыкальных клипов объемом 95 Мб. При этом сначала на флешку записываются фильмы,
//    пока для них есть место. Когда фильмы уже не помещаются (но место еще осталось),
//    далее записываются клипы. Также подсчитать, какой объем (в Мб) останется в конце.


    public static void main(String[] args) {
        final int FILM = 760;
        final int CLIP = 95;
        Scanner scan = new Scanner(System.in);
        int volume = scan.nextInt();
        volume *= 1024; //переводим в мегабайты

        int films = volume / FILM; //количество фильмов: деление нацело на объем одного фильма
        volume %= FILM; // останется после записи фильмов
        int clips = volume / CLIP; //количество клипов
        int remain = volume % CLIP; //останется после записи клипов

        System.out.println(films);
        System.out.println(clips);
        System.out.println(remain);
    }
}
