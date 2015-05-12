package TreesAndGraphs;




public class FindARoute {
	
	static TreeNode generateBTree(int[] array, int start, int end){
		if (start == end) {
			return new TreeNode(array[start]);
		}
		int mid = (start+end)/2;
		TreeNode node = new TreeNode(array[mid]);
		node.leftNode = generateBTree(array, start, mid-1);
		node.rightNode = generateBTree(array, mid+1, end);
		return node;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		TreeNode head = generateBTree(array, 0, 6);
		System.out.println(head.val);
	}
	
}
