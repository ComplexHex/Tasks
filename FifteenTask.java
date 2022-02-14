//Напишите программу на Java, чтобы найти повторяющиеся символы в строке.

public class FifteenTask {
    public static void main(String[] args) {
        String string = "Javatask";
        int count = 0;
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] ==chars[j]){
                    System.out.println(chars[j]);
                    count++;
                    break;
                }
            }
        }
    }


}
