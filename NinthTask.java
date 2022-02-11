/**
 * Написать программу на Java для вычисления серии чисел Фибоначчи.
 * Ряд Фибоначчи — это такая серия чисел, где после первых двух чисел -
 * каждое встречающееся число является суммой двух предыдущих чисел.
 * Пример: 0,1,1,2,3,5,8,13,21
 */

import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        int num, x = 0, y = 0, z = 1;

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.println(x);
        }
    }
}
