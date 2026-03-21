package leetcode.minStack_155;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top: " + obj.top());
        System.out.println("Min: " + obj.getMin());

        obj.pop();
        System.out.println("Top after pop: " + obj.top());
        System.out.println("Min after pop: " + obj.getMin());

        obj.pop();
        System.out.println("Top after pop: " + obj.top());
        System.out.println("Min after pop: " + obj.getMin());
    }
}