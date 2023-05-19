import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        System.out.println("Push element: " + queue.add("a"));
        System.out.println("Push element: " + queue.add("b"));
        System.out.println("Next element: " + queue.element());
        System.out.println("Remove first element: " + queue.poll());
        //if the queue is empty will return exception
        System.out.println("Next element: " + queue.element());
        System.out.println("Peek: " + queue.peek());
    }
}
