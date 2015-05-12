package TreesAndGraphs;

public class CommonAncestor {
	TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if (root == null || p == null || q == null) {
			return null;
		}
		if (p == root || q == root) {
			return root;
		}
		TreeNode left = commonAncestor(root.leftNode, p, q);
		TreeNode right = commonAncestor(root.rightNode, p, q);
		if (left != null && right != null) {
			return root;
		}
		return right == null ? left : right;
	}
}
