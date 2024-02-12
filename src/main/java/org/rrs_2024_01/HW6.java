package org.rrs_2024_01;

public class HW6 {

    /**
     * Задача №1
     *
     * Дана строка:
     * String s = “Перестановочный алгоритм быстрого действия”;
     * необходимо вывести все буквы “о” из этой строки.
     * Для указанной строки ответ будет “ооооо” (или в столбик)
     *
     *
     * Задача №2
     *
     * Дана строка:
     * String s = “Перевыборы выбранного президента”;
     * необходимо подсчитать количество букв “е” в строке.
     * Для указанной строки ответ будет 4.
     *
     *
     * Задача №3
     *
     * Дана строка:
     * String s = “Посмотрите как Рите нравится ритм”;
     * необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
     * Для указанной строки ответ будет 6, 15, 29.
     *
     *
     * Экстра задача
     *
     * Дан массив:
     * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
     * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
     */

    public static void task6_1_1() {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }

    public static void task6_1_2() {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void task6_1_3() {
        String s = "Посмотрите как Рите нравится ритм";
        String str = s.toLowerCase();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'р' && str.charAt(i + 1) == 'и' && str.charAt(i + 2) == 'т' && i < len - 3) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task6_1_4() {
        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"}
        };

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                boolean isContainsE = false;
                if (array[i][j].indexOf("е") == -1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    /**
     * Задача №1
     *
     * Необходимо написать 4 метода:
     * сложение 2х чисел
     * вычитание 2х чисел
     * умножение 2х чисел
     * деление 2х чисел
     *
     *
     * Задачи №2
     *
     * https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
     * https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
     * https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
     * https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
     * https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
     */

    public static int task6_2_1_1(int num1, int num2) {
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    public static int task6_2_1_2(int num1, int num2) {
        System.out.println(num1 - num2);
        return num1 - num2;
    }

    public static int task6_2_1_3(int num1, int num2) {
        System.out.println(num1 * num2);
        return num1 * num2;
    }

    public static int task6_2_1_4(int num1, int num2) {
        System.out.println(num1 / num2);
        return num1 / num2;
    }

    public static void main(String[] args) {
//        task6_1_1();
//        task6_1_2();
//        task6_1_3();
//        task6_1_4();


        task6_2_1_1(2, 5);
        task6_2_1_2(6, 3);
        task6_2_1_3(3, 5);
        task6_2_1_4(8, 2);
    }
}
