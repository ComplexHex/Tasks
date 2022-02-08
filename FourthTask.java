//Напишите программу на Java, чтобы поменять местами значения,
// хранящиеся в двух переменных, без использования третьей переменной.


import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        a = a + b;
        b = a- b;
        a = a-b;

        System.out.println(a + " " + b);
    }

}
