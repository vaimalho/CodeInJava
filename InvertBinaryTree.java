package leetcode;

/*Invert Binary Tree
Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
*/
import java.util.LinkedList;
import java.util.Queue;

class InvertBinaryTree {

	// Recursive Approach
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = new TreeNode();
        if(root!=null){
            invertTree(root.left);
            invertTree(root.right);
            temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        return root;
    }
    
    // Iterative Approach
    public TreeNode invertTree1(TreeNode root) {
    	if(root==null)
            return null;
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
        	TreeNode currNode = q.poll();
        	TreeNode temp = currNode.left;
        	currNode.left = currNode.right;
        	currNode.right = temp;
        	if(currNode.left!=null)
        		q.add(currNode.left);
        	if(currNode.right!=null)
        		q.add(currNode.right);
        }
        return root;
    }

}

