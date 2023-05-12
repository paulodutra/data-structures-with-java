import java.util.Random;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack();

        Random random = new Random();
        int i = 5;

        while (i != 0) {
            System.out.println("Add item: " + stack.push(random.nextInt(20)));
            i--;
        }
        System.out.println("---------");
        System.out.println("First item added: " + stack.get(0));
        System.out.println("---------");
//        for(int index = 0; index < 5; index++) {
//            System.out.println("Remove item: " + stack.pop());
//        }

        while (!stack.isEmpty()) {
            System.out.println("Remove item: " + stack.pop());
        }
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        }

    }
}
