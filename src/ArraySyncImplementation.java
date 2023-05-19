import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraySyncImplementation {
    public static void main(String[] args) {
        List<String> list  = Collections.synchronizedList(new ArrayList<String>());
        list.add("a");
        list.add("b");
        list.add("c");
        //Will sync all values to allow working with multithreading
        synchronized (list) {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        //another way that can used to working with multithreading
        List<String> listCopy  = new CopyOnWriteArrayList<String>();
        listCopy.add("c");
        listCopy.add("b");
        listCopy.add("a");
    }
}
