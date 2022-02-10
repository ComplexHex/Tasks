//Напишите Java-программу, чтобы определить, является ли строка или число палиндромом, или нет


import java.util.Scanner;

public class EightTask {
    public static void main(String[] args) {
        String inputStr, reversedStr = "";
        int strLength;

        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        strLength = inputStr.length();

        for (int i = strLength - 1; i >= 0; i--) {
            reversedStr = reversedStr + inputStr.charAt(i);
        }
        System.out.println(reversedStr);

        if (inputStr.equals(reversedStr)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }

    }

}
