// Implement the Stack interface using an array
public class ArrayStack implements Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1; // Stack is empty initially
    }

    // Push an item onto the stack
    @Override
    public void push(int item) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full, cannot push the item.");
        }
        stack[++top] = item; // Increment top and push the item onto the stack
    }

    // Pop an item from the stack
    @Override
    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty, cannot pop an item.");
        }
        return stack[top--]; // Return the top item and decrement top
    }

    // Peek the top item of the stack
    @Override
    public int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty, cannot peek.");
        }
        return stack[top]; // Return the top item without removing it
    }

    // Check if the stack is empty
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get the size of the stack
    @Override
    public int size() {
        return top + 1; // Size is the index + 1
    }
}
