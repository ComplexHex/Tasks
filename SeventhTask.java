//Напишите программу на Java, чтобы узнать, является ли число простым или нет.

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        int temp, number;
        boolean numberIsPrime = true;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        for (int i = 2; i < number / 2; i++) {
            temp = number % i;
            if (temp == 0) ;
            numberIsPrime = false;
            break;
        }
        if (numberIsPrime) {
            System.out.println("Prime " + number);
        } else System.out.println("Not prime " + number);
    }

}
