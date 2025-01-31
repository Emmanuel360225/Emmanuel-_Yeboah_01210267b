// Exception for stack overflow (when trying to push onto a full stack)
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

// Exception for stack underflow (when trying to pop from an empty stack)
class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}
