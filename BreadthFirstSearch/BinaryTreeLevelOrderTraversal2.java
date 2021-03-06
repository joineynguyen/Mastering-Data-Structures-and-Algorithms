/*Joiney Nguyen

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

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
class Solution 
{
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        
        if(root == null)
        {
            return wrapList;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.offer(root);
        
        int depth = 1;
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            
            wrapList.add(0, new LinkedList<Integer>());
            
            for(int i = 0; i < size; i++)
            {
                TreeNode current = queue.poll();
                wrapList.get(wrapList.size() - depth).add(current.val);
                
                if(current.left != null)
                {
                    queue.offer(current.left);
                }
                if(current.right != null)
                {
                    queue.offer(current.right);
                }
            }
            
            depth++;
        }
        return wrapList;
    }
}
