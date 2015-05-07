package StacksAndQueues;

import java.util.ArrayList;

class Node{
	int value;
	int preIndex;
}

class Stack{
	int firstTop;
	int secondTop;
	int thirdTop;
	int stackSize;
	int currentSize;
	ArrayList<Node> array = new ArrayList<>();
}

public class GenerThreeStacks {
	
	void push(int value, Stack stack, int stackNum){
		if (stack.currentSize >= stack.stackSize) {
			System.out.println("Stack Overflow");
			return;
		}else {
			Node node = new Node();
			node.value = value;
			if (stackNum == 1) {
				node.preIndex = stack.firstTop;
				stack.firstTop = stack.currentSize;
			}else if (stackNum == 2) {
				node.preIndex = stack.secondTop;
				stack.firstTop = stack.currentSize;
			}else {
				node.preIndex = stack.thirdTop;
				stack.firstTop = stack.currentSize;
			}
			stack.currentSize++;
			stack.array.add(node);
		}
	}
	
	Node pop(Stack stack, int stackNum){
		Node node = null;
		if (stack.currentSize == 0) {
			System.out.println("Stack Underflow");
		}else {
			
			if (stackNum == 1) {
				node = stack.array.get(stack.firstTop);
				stack.firstTop = stack.array.get(stack.firstTop).preIndex;
			}else if (stackNum == 2) {
				node = stack.array.get(stack.secondTop);
				stack.secondTop = stack.array.get(stack.secondTop).preIndex;
			}else {
				node = stack.array.get(stack.thirdTop);
				stack.thirdTop = stack.array.get(stack.thirdTop).preIndex;
			}
		}
		return node;
	}
	
}
