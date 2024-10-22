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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> rev = new ArrayList<>();
        if(root==null) return -1;
        Queue<TreeNode> r = new LinkedList<>();
        r.offer(root);
        while(!r.isEmpty()){
            long sum=0;
          int n = r.size();
          for(int i=0;i<n;i++){
            TreeNode node = r.poll();
            sum+=node.val;
            if(node.left!=null) r.offer(node.left);
            if(node.right!=null) r.offer(node.right);
          }
          rev.add(sum);
        }
        if(rev.size()<k) return -1;
        Collections.sort(rev,Collections.reverseOrder());
        return rev.get(k-1);
    }
}