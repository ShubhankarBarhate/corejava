package com.adi;

class GrowableStack implements Stack {
    private Employee[] stack;
    private int top;
    private int capacity;

    public GrowableStack() {
        capacity = STACK_SIZE;
        stack = new Employee[capacity];
        top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top == capacity - 1) {
            // Resize the array
            capacity *= 2;
            Employee[] newStack = new Employee[capacity];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
            System.out.println("Stack resized to capacity: " + capacity);
        }
        stack[++top] = emp;
        System.out.println(emp + " pushed to GrowableStack.");
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        } else {
            return stack[top--];
        }
    }
}
