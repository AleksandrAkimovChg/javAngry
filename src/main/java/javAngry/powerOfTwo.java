package javAngry;

public class powerOfTwo {

    /**
     * Написать код, который принимает число и выдает true,
     * если число является степенью двойки и false - если нет
     * 2, 256, 300, 500, 1024
     * true, true, false, false, true
     */

    public static boolean powerOfTwo(int num) {
        while (num % 2 == 0 && num > 0) {
            num /= 2;
        }
        return num == 1;
    }
}
