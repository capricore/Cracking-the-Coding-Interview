package TreesAndGraphs;

class TreeNode{
	int val;
	TreeNode leftNode;
	TreeNode rightNode;
	TreeNode(int val){
		this.val = val;
	}
}

public class CheckBalanced {
	
	boolean isBalanced(TreeNode	head){
		if (checkBalanced(head) != -1) {
			return true;
		}
		return false;
	}
	
	int checkBalanced(TreeNode head){
		if (head == null) {
			return 0;
		}
		int left = checkBalanced(head.leftNode);
		if (left == -1) {
			return -1;
		}
		int right = checkBalanced(head.rightNode);
		if (right == -1) {
			return -1;
		}
		if (Math.abs(right - left) > 1) {
			return -1;
		}
		return 1 + Math.max(left, right);
	}
	
}
