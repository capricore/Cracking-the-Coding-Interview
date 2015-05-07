package StacksAndQueues;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();
	
	void push(int value){
		if ( stack.isEmpty() || value < minStack.peek() ) {
			
			minStack.push(value);
		}
		stack.push(value);
	}
	
	int pop(){
		if (stack.size() == 0) {
			return 0;
		}
		if (stack.peek() == minStack.peek()) {
			
			minStack.pop();
		}
		return stack.pop();
	}
	
	int min(){
		return minStack.peek();
	}
	
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(3);
		minStack.push(1);
		minStack.push(2);
		System.out.println(minStack.min());
	}
}
