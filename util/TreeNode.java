

public class TreeNode {
	
	 	  int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	         this.right = right;
	      }
		public static void printArray(int[] arr) {
				for(int i=0; i<arr.length ;i++) {
					System.out.print(arr[i]+ " ");
				}
				System.out.println();
			}
}
