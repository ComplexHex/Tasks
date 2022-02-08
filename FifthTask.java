//Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.

import java.util.HashMap;

public class FifthTask {
    public static void main(String[] args) {
        String st = "Current task for Java developers developers";
        String[] words = st.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                int count = map.get(words[i]);
                map.put(words[i], count + 1);
            } else map.put(words[i], 1);
        }
        System.out.println(map);
    }
}
