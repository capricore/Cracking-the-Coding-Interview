package TreesAndGraphs;

public class PrintAllPaths {
	
	int dept(TreeNode root){
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(dept(root.rightNode), dept(root.leftNode));
	}
	
	
	void findSum(TreeNode root, int sum){
		int dept = dept(root);
		int[] path = new int[dept];
		findSum(root, sum, path, 0);
	}
	
	void findSum(TreeNode root, int sum, int[] path, int level){
		if (root == null) {
			return;
		}
		path[level] = root.val;
		int t = 0;
		for (int i = level; i >= 0; i--) {
			t += path[i];
			if (t == sum) {
				printPath(path,i,level);
			}
		}
		findSum(root.leftNode, sum, path, level+1);
		findSum(root.rightNode, sum, path, level+1);
		path[level] = Integer.MIN_VALUE;
	}
	
	void printPath(int[] path, int start, int end){
		for (int i = start; i <= end; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}
}
