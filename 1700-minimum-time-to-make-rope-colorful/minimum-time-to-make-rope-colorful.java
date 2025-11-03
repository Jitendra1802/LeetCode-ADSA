class Solution {
    public int minCost(String colors, int[] neededTime) {
        char prev = colors.charAt(0);
        int cost = 0;
        int n = colors.length();
        for (int i = 1; i < n; i++) {
            char curr = colors.charAt(i);
            if (curr == prev) {
                cost += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
            prev = curr;
        }
        return cost;
    }
}