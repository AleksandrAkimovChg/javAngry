package org.rrs_2024_01;

public class HW2 {

    /**
     * Задача №1
     *
     * Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными:
     * сложение;
     * умножение;
     * вычитание;
     * деление;
     * остаток от деления.
     * Так же сделать проверку на четность этих переменных и вывести результат.
     */

    public static void main(String[] args) {
        int a = 40;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);

        System.out.println(a % 2);
        System.out.println(b % 2);

    }
}
