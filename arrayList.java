import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();
        arrayList.add("50");
        arrayList.add("24");
        arrayList.add("15");
        System.out.println(arrayList.size());
        System.out.println("While");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("For");
        for (Object o : arrayList) {
            System.out.println(o);
        }

        System.out.println("ForI");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }

}
