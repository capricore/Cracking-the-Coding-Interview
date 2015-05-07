package StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

class Stacks extends Stack{
	int capacity;
	Stacks stacks = new Stacks();
	boolean isFull(){
		return stacks.size() == capacity;
	}
}


public class SetOfStacks {
	static ArrayList<Stacks> stacks = new ArrayList<>();
	@SuppressWarnings("unchecked")
	void push(int n){
		Stacks last = getLastStack();
		if (last != null && !last.isFull()) {
			last.push((int)n);
		}else {
			Stacks newStack = new Stacks();
			newStack.push(n);
			stacks.add(newStack);
		}
	}
	
	int pop(){
		Stacks stack = getLastStack();
		int v = (int) stack.pop();
		if (stack.size() == 0) {
			stacks.remove(stacks.size()-1);
		}
		return v;
	}
	
	static Stacks getLastStack(){
		return stacks.get(stacks.size()-1);
	}
}
