package org.rrs_2024_01;

import java.util.Arrays;

public class HW4 {

    /**
     * Задача №1
     *
     * Необходимо вывести числа от 0 до 15.
     *
     *
     * Задача №2
     *
     * Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
     *
     *
     * Задача №3
     *
     * Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
     * Реализовать 2 варианта:
     * использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
     * без использования конструкции if (шаг цикла на ваше усмотрение).
     */

    public static void task4_1_1() {
        System.out.println("task4_1_1");
        for(int i = 0; i < 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\ntask4_1_1");
        System.out.print("\n");
    }

    public static void task4_1_2() {
        System.out.println("task4_1_2");
        for(int i = 1; i < 10_000; i *= 5) {
            System.out.print(i + " ");
        }
        System.out.println("\ntask4_1_2");
        System.out.print("\n");
    }

    public static void task4_1_3() {
        System.out.println("task4_1_3");
        for(int i = 40; i <= 60; i++) {
            if ((i % 4) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\ntask4_1_3");
        System.out.print("\n");
    }

    public static void task4_1_4() {
        System.out.println("task4_1_4");
        for(int i = 40; i <= 60; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println("\ntask4_1_4");
        System.out.print("\n");
    }

    /**
     * Задача №1
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести все нечетные числа из массива.
     *
     *
     * Задача №2
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести все значения массива больше 5.
     *
     *
     * Задача №3
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо увеличить все значения массива на 15.
     */

    private static int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

    public static void task4_2_1() {
        System.out.println("task4_2_1");
        for(int i = 0; i < array.length; i++) {
            if ((array[i] % 2 ) != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\ntask4_2_1");
        System.out.print("\n");
    }

    public static void task4_2_2() {
        System.out.println("task4_2_2");
        for(int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\ntask4_2_2");
        System.out.print("\n");
    }

    public static void task4_2_3() {
        System.out.println("task4_2_3");
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] + 15;
            System.out.print(array[i] + " ");
        }
        System.out.println("\ntask4_2_3");
        System.out.print("\n");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        task4_1_1();
        task4_1_2();
        task4_1_3();
        task4_1_4();

        task4_2_1();
        task4_2_2();
        task4_2_3();
    }
}
