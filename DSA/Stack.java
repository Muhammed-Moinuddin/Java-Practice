import java.util.*;

class FlexibleStack {
    ArrayList<Integer> elements;
    public FlexibleStack() {
        elements = new ArrayList<>();
    }
    public void add(int item) {
        elements.add(item);
        System.out.println(item + " added to stack");
    }
    public int remove() {
        if (elements.isEmpty()) {
            System.out.println("Stack is empty! Cannot remove");
            return -1;
        } else {
            int item = elements.remove(elements.size() - 1);
            System.out.println(item + " removed from stack");
            return item;
        }
    }
    public int top() {
        if (elements.isEmpty()) {
            System.out.println("Stack is empty! Cannot fetch top");
            return -1;
        } else {
            return elements.get(elements.size() - 1);
        }
    }

    public boolean isClear() {
        return elements.isEmpty();
    }
    public void show() {
        if (elements.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack content: ");
            for (int item : elements) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        FlexibleStack stack = new FlexibleStack();

        stack.add(32);
        stack.add(10);
        stack.add(56);
        stack.add(67);
        stack.add(73);
        stack.add(88);
        stack.add(48);
        stack.add(37);
        stack.show();
        System.out.println("Stack Top: " + stack.top());
        stack.remove();
        stack.show();
        System.out.println("Is stack empty? " + stack.isClear());
        System.out.println("Stack Size: " + stack.elements.size());
        stack.remove();
        stack.remove();
        System.out.println("Is stack empty? " + stack.isClear());
    }
}