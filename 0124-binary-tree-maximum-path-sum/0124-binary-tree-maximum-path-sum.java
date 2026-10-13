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
    int maxsum = Integer.MIN_VALUE; 

    public int maxPathSum(TreeNode root) { 
        calculatesum(root); 
        return maxsum; 
    } 
    
    public int calculatesum(TreeNode root) { 
        if (root == null) return 0; 
        
        int leftsum = Math.max(calculatesum(root.left), 0); 
        int rightsum = Math.max(calculatesum(root.right), 0); 
        
        int sum = leftsum + rightsum + root.val; 
        maxsum = Math.max(sum, maxsum); 
        
        return root.val + Math.max(leftsum, rightsum); 
    } 
}
