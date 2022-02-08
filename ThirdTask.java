//Напишите программу на Java для того, чтобы поменять местами значения,
// хранящиеся в двух переменных с помощью третьей переменной

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

    }
}
