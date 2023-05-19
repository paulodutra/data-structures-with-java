import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add("Marie");
        tree.add("Janet");
        tree.add("Jonh");
        tree.add("Paul");
        System.out.println(tree);

        TreeSet<Integer> treeInteger = new TreeSet<Integer>();
        treeInteger.add(2);
        treeInteger.add(3);
        treeInteger.add(4);
        System.out.println(treeInteger);

        Iterator<Integer> iterator = treeInteger.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(treeInteger.first());
        System.out.println(treeInteger.last());
        System.out.println(treeInteger.pollFirst());
        System.out.println(treeInteger.pollLast());
        System.out.println(treeInteger.isEmpty());

    }
}