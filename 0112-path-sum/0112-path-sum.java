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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return dfs(root,0,targetSum);
    }
    public boolean dfs(TreeNode curr, int currsum , int target){
            if(curr==null) return false;
            currsum+=curr.val;
            if(curr.left==null && curr.right==null) return (currsum==target);
            return dfs(curr.left,currsum,target) || dfs(curr.right,currsum,target);
    }
        

}