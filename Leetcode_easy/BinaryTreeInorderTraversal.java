/*
Binary Tree Inorder Traversal

        Given the root of a binary tree, return the inorder traversal of its nodes' values.

        Example 1:

        Input: root = [1,null,2,3]
        Output: [1,3,2]
        Example 2:

        Input: root = []
        Output: []
        Example 3:

        Input: root = [1]
        Output: [1]
*/

package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

     public static class TreeNode {
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
  }

    public static void main(String[] args) {

         TreeNode t = new TreeNode(1);
         t.right = new TreeNode(2);
         t.right.left = new TreeNode(3);

         inorderTraversal(t);

    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ls = new ArrayList<>();
        dfs(root, ls);
        return ls;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    private static void dfs(TreeNode root, List<Integer> ls) {

        if(root==null){
            return;
        }
        dfs(root.left, ls);
        ls.add(root.val);
        dfs(root.right, ls);
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static List<Integer> inorderTraversalIteratively(TreeNode root) {

        List<Integer> ls = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        while(root !=null || !st.isEmpty()){
            while(root != null){
                st.add(root);
                root = root.left;
            }

            root = st.pop();
            ls.add(root.val);
            root = root.right;
        }
        return ls;
    }
}
