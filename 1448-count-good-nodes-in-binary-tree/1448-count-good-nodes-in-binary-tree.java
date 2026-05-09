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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    public int dfs(TreeNode curr,int maxval){
        if(curr==null) return 0;
        int c=0;
        if(curr.val>=maxval) {
            maxval=curr.val;
            c=1;}
        c+=dfs(curr.left,maxval);
        c+=dfs(curr.right,maxval);

        return c;
    }

}