package com.company;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static int exercise_9(int number) {
        return (number - 21);
    }

    public static double exercise_10(double number_1, double number_2) {
        return ((number_1 + number_2) / 2.0);
    }

    public static double exercise_11(double number_1, double number_2) {
        return (Math.pow(number_1 + number_2, 0.5));
    }

    public static double exercise_12(double x1, double y1, double x2, double y2) {
        return (Math.pow(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2), 0.5));
    }



    public static void main(String[] args) {
        System.out.print("Введите номер примера: ");
        Scanner verb = new Scanner(System.in);
        int num = verb.nextInt();
        switch (num) {
            case 1:
                System.out.println("1. Выведите на жкран текст Hello World");
                System.out.println("Hello World");
                break;
            case 2:
                System.out.println("2. Создайте переменную, присвоив ей целочисленное значение. Выведите Значение на экран: ");
                int argue = 30;
                System.out.println("Мы создали переменную argue с значением " + argue);
                break;

            case 3:
                System.out.println("3. Создайте переменную, увеличьте её на единицу несколькими способами и выведите значение на экран.");
                argue = 45;
                System.out.println("Мы создали переменную argue с значением " + argue);
                argue++;
                System.out.println("1-ый способ увелечения : argue++ --> argue = " + argue);
                argue = 45;
                argue = argue + 1;
                System.out.println("2-ой способ увелеяения : argue = argue + 1 --> argue = " + argue);
                break;

            case 4:
                System.out.println("4. Даны две переменные. Поменяйте значения переменных друг с другом двумя способами: ");
                System.out.println("a = 34       b = 89");
                int a = 34;
                int b = 89;
                int c = a;
                a = b;
                b = c;
                System.out.println(" 1) Используя третую перемунную:  a = " + a + "   b  = " + b);
                a = 34;
                b = 89;
                a = a + b;
                b = a - b;
                a = a - b;
                System.out.println(" 2) Используя арифметический метод:  a =  " + a + "   b = " + b);
                break;
            case 5:
                System.out.println("5. Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.");
                a = 5;
                b = 3;
                double g = Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
                System.out.println("Гипотенуза равна : " + g);
                break;

            case 6:
                System.out.println("6. Дано натуральное число. Выведите его последнюю цифру.");
                int number = 465;
                int last_num = number % 10;
                System.out.println("Последняя цифра равна = " + last_num);
                break;

            case 7:
                System.out.println("7. Дано неотрицательное целое число. Найдите число десятков в его десятичной записи (то есть вторую справа цифру его\n" +
                        "десятичной записи).");
                a = 678;
                b = (a / 10) % 10;
                System.out.println("Число десятков равно = " + b);
                break;

            case 8:
                System.out.println("8. Дано двузначное число. Найдите число десятков в нем.");
                a = 56;
                System.out.println("Число десятков равно = " + a/10);
                break;

            case 9:
                number = 56;
                System.out.println("Результат с методом: " + exercise_9(number));
                break;

            case 10:
                int number_1 = 56;
                int number_2 = 45;
                System.out.println("10. Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее арифметическое");
                System.out.println(exercise_10(number_1,number_2));
                break;

            case 11:
                number_1 = 56;
                number_2 = 64;
                System.out.println("11. Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее геометрическое");
                System.out.println(exercise_11(number_1,number_2));
                break;

            case 12:
                System.out.println("12. Реализуйте метод, в который передается 4 числа с плавающей точкой. Первые два числа – координаты x, y первой точки.\n" +
                        "Вторые два числа – координаты x,y второй точки. Найти расстояние между двумя точками");
                double x1 = 4.5;
                double y1  = 6.2;
                double x2 = 2.5;
                double y2 = 7.1;
                System.out.println("Рассточние между точками равно = " + exercise_12(x1,y1,x2,y2));
                break;

            default:
                throw new IllegalStateException("Нет такого номера: " + num);
        }
    }
}