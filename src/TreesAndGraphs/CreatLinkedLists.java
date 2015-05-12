package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class CreatLinkedLists {
	
	static ArrayList<LinkedList<TreeNode>> creatLinkedList(TreeNode head){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();
		LinkedList<TreeNode> toAdd = new LinkedList<>();
		toAdd.add(head);
		while (!toAdd.isEmpty()) {
			result.add(toAdd);
			LinkedList<TreeNode> temp = new LinkedList<>();
			for (TreeNode treeNode : toAdd) {
				if (treeNode.leftNode != null) {
					temp.add(treeNode.leftNode);
				}
				if (treeNode.rightNode != null) {
					temp.add(treeNode.rightNode);
				}
			}
			toAdd = temp;
		}
		return result;
	}
	
	public static void main(String[] args) {
		TreeNode head = new TreeNode(4);
		head.leftNode = new TreeNode(2);
		head.rightNode = new TreeNode(6);
		head.leftNode.leftNode = new TreeNode(1);
		head.leftNode.rightNode = new TreeNode(3);
		ArrayList<LinkedList<TreeNode>> result = creatLinkedList(head);
		for (LinkedList<TreeNode> linkedList : result) {
			for (TreeNode treeNode : linkedList) {
				System.out.print(treeNode.val);
			}
			System.out.println();
		}
	}
}
