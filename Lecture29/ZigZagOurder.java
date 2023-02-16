package Lecture29;

import java.util.*;

public class ZigZagOurder {
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
		 
		class Solution {
		    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		      return levelourder(root);
		    }

		    private List<List<Integer>> levelourder(TreeNode root) {
				Queue<TreeNode> q = new LinkedList<TreeNode>();
				q.add(root);

				List<List<Integer>> ans = new ArrayList<>();
		         if(root==null) return ans;
		         int n=0;
				while (!q.isEmpty()) {
					List<Integer> list = new ArrayList<>();
					int size = q.size();
					int i = 1;

					while (i <= size) {
						TreeNode k = q.remove();
		                if(n%2!=0){
		                    list.add(0,k.val);
		                }
		                else{
						list.add(k.val);
		                }
						if (k.left != null) {
							q.add(k.left);
						}

						if (k.right != null) {
							q.add(k.right);
						}
						i++;
					}
					ans.add(list);
		            n++;
				}
		        return ans;   
		    }
		}
}
