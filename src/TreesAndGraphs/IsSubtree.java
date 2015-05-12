package TreesAndGraphs;

public class IsSubtree {
	boolean ContainsTree(TreeNode t1, TreeNode t2){
		if (t2 == null) {
			return true;
		}
		return SubTree(t1,t2);
	}
	
	boolean SubTree(TreeNode t1, TreeNode t2){
		if (t1 == null) {
			return false;
		}
		if (t1.val == t2.val) {
			if (matchTree(t1,t2)) {
				return true;
			}
		}
		return SubTree(t1.leftNode, t2) || SubTree(t1.rightNode, t2);
	}
	
	boolean matchTree(TreeNode t1, TreeNode t2){
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		if (t1.val != t2.val) {
			return false;
		}
		return matchTree(t1.leftNode, t2.leftNode) && matchTree(t1.rightNode, t2.rightNode);	
	}
}
