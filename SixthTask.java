//Напишите Java-программу для итерации объекта типа HashMap
// с использованием цикла while и улучшенного цикла for.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SixthTask {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Hello");
        map.put(2,"World");
        map.put(3,"Have a nice day!");

        System.out.println("loop While");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapp = (Map.Entry) iterator.next();
            System.out.println(mapp.getKey() + " " + mapp.getValue());
        }
        System.out.println("loop For");
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
