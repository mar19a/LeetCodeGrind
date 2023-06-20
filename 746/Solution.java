/*
    You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.

 

Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.
 * 
 */

 class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // dp[i] represents the cost to reach the i-th step
        int[] dp = new int[cost.length + 1];
        // It doesn't cost anything to reach the first or second step
        dp[0] = dp[1] = 0;

        // Start from the third step
        for (int i = 2; i <= cost.length; i++) {
            // The cost to reach the i-th step is the cost of the i-th step itself, plus the minimum cost of reaching the two previous steps
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}