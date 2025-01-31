public class Main {
    public static void main(String[] args) {
        try {
            // Create a stack with a capacity of 3
            Stack stack = new ArrayStack(3);

            // Push elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Uncomment the following line to test StackOverflowException
            // stack.push(40); // This will throw StackOverflowException

            System.out.println("Stack size: " + stack.size());
            System.out.println("Top element: " + stack.peek());

            // Pop elements from the stack
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());

            // Uncomment the following line to test StackUnderflowException
            // System.out.println("Popped element: " + stack.pop()); // This will throw StackUnderflowException

            System.out.println("Stack size after pops: " + stack.size());

        } catch (StackOverflowException | StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
