1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int height(TreeNode root,int arr[]) {
18        if(root==null) return 0;
19        int left=height(root.left,arr);
20        int right=height(root.right,arr);
21        arr[0]=Math.max(arr[0],left+right);
22        return 1+Math.max(left,right);
23    }
24    public int diameterOfBinaryTree(TreeNode root)
25    {
26        if(root==null)return 0;
27        int arr[]=new int[1];
28        height(root,arr);
29        return arr[0];
30    }
31}