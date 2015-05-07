package StacksAndQueues;

import java.util.Stack;

public class HanoiTower {
	int index = 0;
	private Stack<Integer> stack;
	
	HanoiTower(int n){
		stack = new Stack<>();
		index = n;
	}
	
	public int index(){
		return index;
	}
	
	public void add(int val) {
		if (!stack.isEmpty() && stack.peek() < val) {
			System.out.println("Error Dishes Push");
			return;
		}
		stack.push(val);
	}
	
	
	public int getTop() {
		return stack.pop();
	}
	public void MoveTopto(HanoiTower origin, HanoiTower hanoiTower){
		int top = origin.getTop();
		hanoiTower.add(top);
		System.out.println("Move disk" + top + " from " + origin.index + " to " + hanoiTower.index);
	}
	
	public void MoveDisks(int n,HanoiTower origin , HanoiTower destination, HanoiTower buffer) {
		if (n > 0) {
			MoveDisks(n-1,origin, buffer, destination);
			MoveTopto(origin, destination);
			MoveDisks(n-1, buffer , destination, origin);
		}
	}
	
	public static void main(String[] args) {
		int n = 3;
		HanoiTower tower = new HanoiTower(-1);
		HanoiTower[] towers = new HanoiTower[3];
		for (int i = 0; i < towers.length; i++) {
			towers[i] = new HanoiTower(i);
		}
		for (int i = n-1; i >= 0; i--) {
			towers[0].add(i);
		}
		tower.MoveDisks(n,towers[0], towers[2], towers[1]);
	}
}
