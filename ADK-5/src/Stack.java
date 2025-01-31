// Define the Stack interface with the basic stack operations
public interface Stack {
    void push(int item) throws StackOverflowException;   // Push an item onto the stack
    int pop() throws StackUnderflowException;            // Pop an item from the stack
    int peek() throws StackUnderflowException;           // Peek the top item of the stack
    boolean isEmpty();                                  // Check if the stack is empty
    boolean isFull();                                   // Check if the stack is full
    int size();                                         // Get the size of the stack
}
