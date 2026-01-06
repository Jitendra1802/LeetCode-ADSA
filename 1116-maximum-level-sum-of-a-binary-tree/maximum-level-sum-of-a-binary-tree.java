class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int max = Integer.MIN_VALUE;
        int ans = 1;
        int curr = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                sum += temp.val;

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }

            if (sum > max) {
                max = sum;
                ans = curr;
            }
            curr++;
        }

        return ans;
    }
}
