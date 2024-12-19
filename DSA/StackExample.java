import java.util.ArrayList;

class DynamicStack {
    // Declare an ArrayList to hold the stack elements
    ArrayList<Integer> stack;

    // Constructor to initialize the stack (no size limit)
    public DynamicStack() {
        stack = new ArrayList<>();  // Create an empty ArrayList to store elements
    }

    // Method to push an element onto the stack
    public void push(int value) {
        stack.add(value);  // Add the element to the end of the list (top of the stack)
        System.out.println(value + " pushed to stack");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (stack.isEmpty()) {  // Check if the stack is empty
            System.out.println("Stack is empty! Cannot pop");
            return -1;  // Return -1 to indicate an error if the stack is empty
        } else {
            int value = stack.remove(stack.size() - 1);  // Remove the last element (top of the stack)
            System.out.println(value + " popped from stack");
            return value;  // Return the popped element
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (stack.isEmpty()) {  // Check if the stack is empty
            System.out.println("Stack is empty! Cannot peek");
            return -1;  // Return -1 to indicate an error if the stack is empty
        } else {
            return stack.get(stack.size() - 1);  // Return the last element (top of the stack)
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();  // Return true if the stack is empty, otherwise false
    }

    // Method to display all elements in the stack
    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int value : stack) {
                System.out.print(value + " ");  // Print each element in the stack
            }
            System.out.println();  // Move to the next line after printing all elements
        }
    }
}

// Main class to test the DynamicStack
public class StackExample {
    public static void main(String[] args) {
        // Create a stack with no size limit (using ArrayList internally)
        DynamicStack stack = new DynamicStack();

        // Push elements to the stack
        stack.push(10);  // Stack: 10
        stack.push(20);  // Stack: 10 20
        stack.push(30);  // Stack: 10 20 30
        stack.push(40);  // Stack: 10 20 30 40
        stack.push(50);  // Stack: 10 20 30 40 50
        stack.push(60);  // Stack: 10 20 30 40 50 60 
        stack.push(70);  // Stack: 10 20 30 40 50 60 70
        stack.push(80);  // Stack: 10 20 30 40 50 60 70 80
        stack.push(90);  // Stack: 10 20 30 40 50 60 70 80 90
        stack.push(58);  // Stack: 10 20 30 40 50 60 70 80 90 58
        stack.push(67);  // Stack: 10 20 30 40 50 60 70 80 90 58 67
        stack.push(43);  // Stack: 10 20 30 40 50 60 70 80 90 58 67 43


        // Display the current stack
        stack.display();  // Output: Stack elements: 10 20 30 40

        // Peek at the top element
        System.out.println("Top of stack: " + stack.peek());  // Output: Top of stack: 40

        // Pop elements from the stack
        stack.pop();  // Stack: 10 20 30
        stack.pop();  // Stack: 10 20

        // Display the current stack again
        stack.display();  // Output: Stack elements: 10 20

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: false

        // Check the size of the stack
        System.out.println("Size of stack: " + stack.stack.size());  // Output: 2 (because there are 2 elements left)

        // Pop all elements to make the stack empty
        stack.pop();  // Stack: 10
        stack.pop();  // Stack: empty

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: true
    }
}