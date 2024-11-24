class Stack {
    private int maxSize; // Maximum size of the stack
    private double[] stackArray; // Array to store stack elements
    private int top; // Index of the top element
    // Constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new double[maxSize];
        top = -1;
    }
    // Push method to add an element to the stack
    public void push(double value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow!");
            return;
        }
        stackArray[++top] = value;
    }
    // Pop method to remove and return the top element
    public double pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow!");
        }
        return stackArray[top--];
    }
    // Peek method to view the top element without removing it
    public double peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stackArray[top];
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
