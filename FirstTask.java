//Напишите программу на Java для переворачивания строки,
// изменив расположение символов в строке задом наперёд без использования встроенных в String функций.


public class FirstTask {
    public static void main(String[] args) {
        String string ="FirstTask";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder=stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}

//    Напишите программу на Java для переворота последовательности символов
//    в строке без использования встроенной в String функции reverse().

 class SecondTask{
     public static void main(String[] args) {
         String st = "SecondTask";
         char symbols[]=st.toCharArray();
         for (int i = symbols.length-1; i >=0; i--) {
             System.out.print(symbols[i]);
         }
     }
}