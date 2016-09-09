package ua.epam;

import java.util.Scanner;

/**
 * Created by Nataliia_Shevtsova on 9/9/2016.
 */
public class Task3 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

         /* Задание 3.1	Создать программу, проверяющую и сообщающую на экран, является ли целое число
            записанное в переменную n, чётным либо нечётным.*/
    System.out.println("Задание 3.1" );


    System.out.println("Input a number");

    int someNumber = scan.nextInt();

    if (someNumber%2 == 0) {
        System.out.println("even");
    } else {
        System.out.println("uneven");
    }

         /* Задание 3.2 Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
         записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/
    System.out.println("Задание 3.2" );

    System.out.println("Input m");
    double m = scan.nextDouble();
    System.out.println("Input n");
    double n = scan.nextDouble();
    int u = 10;
    if (Math.abs(u-m)<(Math.abs(u-n))) {
        System.out.println(m + "ближе к 10");
    } else {
        System.out.println(n + " ближе к 10");
    }

        /* Задание 3.3	Создать программу, выводящую на экран случайное трёхзначное натуральное число (задается Вами)
        и его наибольшую цифру. Примеры работы программы:
            В числе 208 наибольшая цифра 8
            В числе 774 наибольшая цифра 7
            В числе 613 наибольшая цифра 6 */
    System.out.println("Задание 3.3" );

    int a = 61;
    int b = 524;
    int c = (int) (b + Math.random() * (a - b)) ;

    int num10 = 10;
    int sotni = c / a;
    int tmp = c % a;
    int desyatki = tmp / num10;
    int edenici = tmp % num10;

    if ( sotni > desyatki && sotni > edenici){
        System.out.println("max number = " + sotni);
    } else
    if( desyatki > sotni && desyatki > edenici){
        System.out.println("max number = " + desyatki);
    } else
    if (sotni == desyatki || sotni == edenici){
        System.out.println("max number  = " + sotni);
    } else
    if (edenici == desyatki || edenici == sotni){
        System.out.println("max number = " + edenici);
    } else
    if (sotni == desyatki && desyatki == edenici){
        System.out.println("max number = " + sotni);
    }else
        System.out.println("max number = " + edenici);


        /*Задание 3.4	Создать программу, которая будет проверять попало ли случайно выбранное
        Вами из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
        Примеры работы программы:
        Число 113 не содержится в интервале (25,100)
        Число 72 содержится в интервале (25,100)
        Число 25 не содержится в интервале (25,100)
        Число 155 не содержится в интервале (25,100) */
    System.out.println("Задание 3.4" );

    int min = 5;
    int max = 155;
    int granMax= 100;
    int granMin = 25;

    int interval = min + (int) (Math.random() * ((max - min) + 1)) ;

    System.out.println("Number with interval = " + interval);

    if (interval > granMax || interval < granMin){
        System.out.println("Число " + interval +" находится не в промежутке [25;100]");
    } else
        System.out.println("Число " + interval +" yаходится в промежутке [25;100]");

}
}





