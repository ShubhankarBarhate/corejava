package com.adi;

class FixedStack implements Stack {
    private Employee[] stack;
    private int top;

    public FixedStack() {
        stack = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top == STACK_SIZE - 1) {
            System.out.println("Stack is full. Cannot push " + emp);
        } else {
            stack[++top] = emp;
            System.out.println(emp + " pushed to FixedStack.");
        }
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

	

