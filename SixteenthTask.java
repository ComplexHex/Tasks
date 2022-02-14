//Напишите Java-программу, чтобы найти второе по величине число в массиве.

public class SixteenthTask {
    public static void main(String[] args) {
        int[] numArray = {50, 64, 89, 23, 14, 25, 78, 92, 47, 12};
        int biggest = numArray[0];
        int secondBiggest = numArray[0];

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > biggest) {
                secondBiggest = biggest;
                biggest = numArray[i];
            } else if (numArray[i] > secondBiggest && numArray[i] != biggest) {
                secondBiggest = numArray[i];
            }

        }System.out.println(secondBiggest + " this");
    }
}
