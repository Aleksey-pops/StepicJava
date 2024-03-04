package Stepik;


import java.util.Scanner;

class TestAndreyScaner {
    public static void main(String[] args) {
//        String name = "Андрей";
        // int age = 23;
//        double discount = 15.5;
        // put your code here
//        System.out.println("С днем рождения, " + name + "!");
        // System.out.println("Сегодня Вам " + age + "!");
//        System.out.println("По этому поводу Вам скидка " + discount + "%");
//        System.out.println("на весь ассортимент нашего сайта!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scan.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println("Сколько вам лет?");
        if (scan.hasNextInt()) {
            int age = scan.nextInt();
            System.out.println(age + " - это много!");
        }else{
            System.out.println("Неверный формат ввода!!!");
        }
    }
}

