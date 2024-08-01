/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(checkSymmetric(root.left, root.right)) 
            return true;
        return false;
    }

    public boolean checkSymmetric(TreeNode A, TreeNode B){
        if(A == null && B == null) return true;
        if(A == null || B == null) return false;

        if(A.val == B.val){
            if(checkSymmetric(A.left, B.right) && checkSymmetric(A.right, B.left))
                return true;
        }
        return false;
    }
}