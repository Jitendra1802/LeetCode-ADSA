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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex=0;
        return buildTree(inorder, preorder, inorder.length);
    }
    static int preIndex=0;
    static HashMap<Integer, Integer> map=new HashMap<>();

    public static TreeNode buildTree(int inorder[], int preorder[], int n){
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }

        return build(preorder, inorder,0,n-1);

    }
    private static TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd){
        if(inStart>inEnd){
            return null;

        }
        if(preIndex>=inorder.length){
            return null;
        }
        int rootVal=preorder[preIndex++];
        TreeNode root= new TreeNode(rootVal);

        int inIndex=map.get(rootVal);

        root.left=build(preorder, inorder, inStart, inIndex-1);
        root.right= build(preorder, inorder, inIndex+1, inEnd);

        return root;
    }
}