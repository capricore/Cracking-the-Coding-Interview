package TreesAndGraphs;

public class IsBST {
	static boolean isBST(TreeNode head){
		if (head == null) {
			return true;
		}
		if (head.leftNode == null && head.rightNode == null) {
			return true;
		}else if (head.leftNode == null && head.rightNode != null) {
			return head.val <= head.rightNode.val && isBST(head.rightNode);
		}else if (head.rightNode == null && head.leftNode != null) {
			return head.val > head.leftNode.val && isBST(head.leftNode);
		}else {
			return head.val > head.leftNode.val && head.val <= head.rightNode.val && isBST(head.leftNode) && isBST(head.rightNode);
		}
	}
	
	public static void main(String[] args) {
		TreeNode head = new TreeNode(4);
		head.leftNode = new TreeNode(2);
		head.rightNode = new TreeNode(6);
		head.leftNode.leftNode = new TreeNode(1);
		head.leftNode.rightNode = new TreeNode(3);
		System.out.println(isBST(head));
	}
}
