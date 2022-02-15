//Напишите Java-программу для удаления всех пробелов из строки с помощью replace().

public class EighteenthTask {
    public static void main(String[] args) {
        String s1 = "We are the champions, my friend!";

        String s2 = s1.replaceAll("\\s","");

        System.out.println(s2);
    }
}
