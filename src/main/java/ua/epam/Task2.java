package ua.epam;

import java.util.Scanner;

/**
 * Created by Nataliia_Shevtsova on 9/9/2016.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         /* Задание 2.1 В переменной n (выбранное Вами) хранится двузначное число.
         Создайте программу, вычисляющую и выводящую на экран сумму цифр n*/
        System.out.println("Задание 2.1" );

        int n1 = 45;
        System.out.println("Сумма числа " + n1 + " = " + ((n1 % 10) + ((n1 / 10) % 10)));

         /* Задание 2.2 В переменной n (выбранное Вами) хранится трёхзначное число.
         Создайте программу, вычисляющую и выводящую на экран сумму цифр n.*/
        System.out.println("Задание 2.2" );

        int n2 = 369;
        System.out.println("SСкмма числа " + n2 + " = " + ((n2 % 10) + (n2 / 10) % 10 + ((n2 / 100) % 10)));

        /* Задание 2.3 В переменной n хранится натуральное двузначное число.
         Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
        System.out.println("Задание 2.3" );

        System.out.println("Введите двузначное число");
        int n3 = scan.nextInt();
        System.out.println("Сумма числа " + n3 + " = " + ((n3 % 10) + ((n3 / 10) % 10)));


        /* Задание 2.4 В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран*/
        System.out.println("Задание 2.4" );

        System.out.println("Введите число с дробной частью");
        float n4 = scan.nextFloat();
        float result =  Math.round(n4);
        System.out.println("Округлени до ближайшего целого" + n4 + " оставит " + result);

    }
}
