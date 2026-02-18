class Solution {
    public int maxSubArray(int[] nums) {
        /*  Brute : USING prefixSum AND minPrefixSum
        int n = nums.length;

        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];

        // Step 1: Build prefix sum in O(n)
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int minPrefix = 0;
        int maxSum = prefixSum[0];

        // Step 2: Compute max subarray
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, prefixSum[i] - minPrefix);
            minPrefix = Math.min(minPrefix, prefixSum[i]);
        }

        return maxSum; */

        //Optimized : Kadane's Algorithm
        int max = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}