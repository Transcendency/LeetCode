package LeetCode.Average_Binary_Value_by_Level;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
	public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        List<Double> result = new LinkedList<Double>();
        
        while(q.peek() != null){
            // compute sum of nodes and
            // count of nodes in current level.
            
            double sum = 0;
            double count = 0;
            
            Queue<TreeNode> tq = new LinkedList<TreeNode>();
            while(q.peek() != null){
                TreeNode node = (TreeNode)q.poll();
                sum += node.val;
                count++;
                
                if (node.left != null){
                    tq.add(node.left);
                }
                
                if (node.right != null){
                    tq.add(node.right);
                }
            }
            
            result.add(sum / count);
            q = tq;
            
        }
        return result;
	}
}
