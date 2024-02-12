package org.rrs_2024_01;

import java.util.Arrays;

public class HW5 {

    /**
     * Задача №1
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести сумму всех значений массива.
     *
     *
     * Задача №2
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести максимальное значение массива.
     *
     *
     * Задача №3
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести минимальное значение массива.
     *
     *
     * Задача №4
     *
     * Дан массив:
     * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     * необходимо вывести среднее арифметическое всех значений массива.
     *
     *
     * Задача №5
     *
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести сумму элементов массива.
     *
     *
     * Задача №6
     *
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести максимальное значение массива.
     *
     * Задача №7
     *
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести количество элементов в массиве.
     */

    static int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    static int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

    public static void task5_1_1() {
        System.out.println("task5_1_1");

        int sum = 0;
        for(int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
            System.out.print(sum + " ");
        }
        System.out.println("\ntask5_1_1");
        System.out.print(sum + " ");
        System.out.print("\n");
    }

    public static void task5_1_2() {
        System.out.println("task5_1_2");

        int max = array1[0];
        for(int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
            System.out.print(max + " ");
        }
        System.out.println("\ntask5_1_2");
        System.out.print(max + " ");
        System.out.print("\n");
    }

    public static void task5_1_3() {
        System.out.println("task5_1_3");

        int min = array1[0];
        for(int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
            System.out.print(min + " ");
        }
        System.out.println("\ntask5_1_3");
        System.out.print(min + " ");
        System.out.print("\n");
    }

    public static void task5_1_4() {
        System.out.println("task5_1_4");
        double sum = 0;
        for(int i = 0; i < array1.length; i++) {
            sum += array1[i];
            System.out.print(sum + " ");
        }
        double medium = sum / array1.length;
        System.out.println("\ntask5_1_4");
        System.out.println(medium);
        System.out.print("\n");
    }

    public static void task5_1_5() {
        System.out.println("task5_1_5");

        int sum = 0;
        for(int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum += array2[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println("\ntask5_1_5");
        System.out.println(sum);
        System.out.print("\n");
    }

    public static void task5_1_6() {
        System.out.println("task5_1_6");

        int max = array2[0][0];
        for(int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (max < array2[i][j]) {
                    max = array2[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println("task5_1_6");
        System.out.print("\n");
    }

    public static void task5_1_7() {
        System.out.println("task5_1_7");

        int count = 0;
        for(int i = 0; i < array2.length; i++) {
            count += array2[i].length;
        }
        System.out.println(count);
        System.out.println("task5_1_7");
        System.out.print("\n");
    }

    /**
     * Задача №1
     *
     * 0  1  2  3  4  5  6  7  8  9
     * 0  1  2  3  4  5  6  7  8
     * 0  1  2  3  4  5  6  7
     * 0  1  2  3  4  5  6
     * 0  1  2  3  4  5
     * 0  1  2  3  4
     * 0  1  2  3
     * 0  1  2
     * 0  1
     * 0
     *
     *
     * Задача №2
     *
     * 0  1  2  3  4  5  6  7  8  9
     *     0  1  2  3  4  5  6  7  8
     *         0  1  2  3  4  5  6  7
     *              0  1  2  3  4  5  6
     *                  0  1  2  3  4  5
     *                      0  1  2  3  4
     *                          0  1  2  3
     *                              0  1  2
     *                                  0  1
     *                                      0
     *
     *
     * Задача №3
     *
     * 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
     *    8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
     *       7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
     *          6 5 4 3 2 1 0 1 2 3 4 5 6
     *             5 4 3 2 1 0 1 2 3 4 5
     *                4 3 2 1 0 1 2 3 4
     *                   3 2 1 0 1 2 3
     *                      2 1 0 1 2
     *                         1 0 1
     *                            0
     */


    public static void task5_2_1() {
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task5_2_2() {
        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task5_2_3() {
        for (int i = 10; i >= 0; i--) {

            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        task5_1_1();
//        task5_1_2();
//        task5_1_3();
//        task5_1_4();
//        task5_1_5();
//        task5_1_6();
//        task5_1_7();

//        task5_2_1();
//        task5_2_2();
        task5_2_3();
    }
}
