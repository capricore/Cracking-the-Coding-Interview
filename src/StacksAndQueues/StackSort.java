package StacksAndQueues;

import java.util.Stack;

public class StackSort {
	Stack<Integer> buffer = new Stack<>();
	Stack<Integer> result = new Stack<>();
	
	Stack<Integer> getResult(){
		return	result;
	}
	
	StackSort(Stack<Integer> stack){
//		while (!stack.isEmpty()) {
			buffer.addAll(stack);
//		}
	}
	
	void sort(){
		while (!buffer.isEmpty()) {
			if (result.isEmpty() || buffer.peek() > result.peek()) {
				result.push(buffer.pop());
			}else if (buffer.peek() < result.peek()) {
				int n = buffer.pop();
				while (!result.isEmpty()) {
					if (result.peek() > n) {
						buffer.push(result.pop());
					}else {
						result.push(n);
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(5);
		stack.push(3);
		stack.push(2);
		StackSort stackSort = new StackSort(stack);
		stackSort.sort();
		Stack<Integer> result = stackSort.getResult();
		while (!result.isEmpty()) {
			System.out.println(result.pop());
		}
	}
	
}
