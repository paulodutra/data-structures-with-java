import java.util.Vector;

public class VectorImplementation {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;

//        Vector v = new Vector<>();
        Vector v = new Vector<>(2, 3);
        System.out.println(v.capacity());
        v.addElement(1);
        v.addElement("a");
        System.out.println(v.size());
        v.addElement("b");
        System.out.println(v.capacity());
//        while(v.iterator().hasNext()) {
//            System.out.println(v.iterator().next());
//        }
    }
}
