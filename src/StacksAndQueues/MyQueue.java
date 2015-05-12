package StacksAndQueues;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> stackNew = new Stack<>();
	Stack<Integer> stackOld = new Stack<>();
	
	void add(int n){
		stackNew.push(n);
	}
	
	int remove(){
		if (!stackOld.isEmpty()) {
			return stackOld.pop();
		}else {
			while (!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
			return stackOld.pop();
		}
	}
	
	int size(){
		return stackNew.size() + stackOld.size();
	}
	
	int peek(){
		if (!stackOld.isEmpty()) {
			return stackOld.peek();
		}else {
			while (!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
			return stackOld.peek();
		}
	}
}
