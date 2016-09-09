package ua.epam;

import java.util.Scanner;

/**
 * Created by Nataliia_Shevtsova on 9/9/2016.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        /* Задание 1.1 Создайте программу, которая вычислит выражение  12*4/3+158*2
        и выведет результат на экран  */
        System.out.println("Задание 1.1" );

        int result1 = 12 * 4 / 3 + 158 * 2;
        System.out.println("Результат1 = " + result1);

        /* Задание 1.2	Создайте программу, которая вычислит выражение 14/20*9+14*(29-14*2+14/3)
        и выведет результат на экран. При этом число 14 обязательно сохраните в отдельной переменной,
        выбрав для неё подходящий тип. */
        System.out.println("Задание 1.2" );

        int a = 14;
        int b = 20;
        int c = 9;
        int d = 29;
        int e = 2;
        int f = 3;
        double result2 = (double) a / b * c + (double) (a * (d - (a * e) + (a / f)));
        System.out.println("Результат2 = " + result2);

        /* Задание 1.3	В переменных q и w хранятся два натуральных числа. Создайте программу,
        выводящую на экран результат деления q на w с остатком.
        Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
        21 / 8 = 2 и 5 в остатке*/
        System.out.println("Задание 1.3" );


        int q = 48;
        int w = 30;
        int h = q / w;
        int y = q % w;
        System.out.println("Деление 48/30 = " + h + " Остаток = " + y);

    }
}



