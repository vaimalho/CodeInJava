/*
Symmetric Tree

        Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

        Example 1:


        Input: root = [1,2,2,3,4,4,3]
        Output: true
        Example 2:


        Input: root = [1,2,2,null,3,null,3]
        Output: false

*/
package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTreeMain {

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
  }

    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {

          return isMirrorRecursive(root.left, root.right);
    }

    // Time Complexity: O(N)
    // SPace Complexity: O(N)
    private static boolean isMirrorRecursive(TreeNode left, TreeNode right) {

          if(left==null && right==null)
              return true;

          if(left==null || right==null)
              return false;

          return left.val == right.val
              && isMirrorRecursive(left.left, right.right) && isMirrorRecursive(left.right, right.left);
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    private static boolean isMirroriteraive(TreeNode left, TreeNode right) {

          Queue<TreeNode> q = new LinkedList<>();
          q.add(left);
          q.add(right);

          while(!q.isEmpty()){

              TreeNode l = q.poll();
              TreeNode r = q.poll();

              if(l==null && r==null)
                  return true;
              if(l==null || r==null)
                  return false;
              if(l.val != r.val)
                  return false;

              q.add(l.left);
              q.add(r.right);
              q.add(l.right);
              q.add(r.left);
          }

          return true;
    }
}
