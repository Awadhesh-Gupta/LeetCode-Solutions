# Problem: Maximum Subarray

## Approach
Used Prefix Sum and minimum prefix tracking to compute maximum subarray sum. Also optimized using Kadane’s Algorithm for a space-efficient solution.

## Time Complexity
Prefix Sum Approach: O(n)  
Kadane’s Algorithm: O(n)

## Space Complexity
Prefix Sum Approach: O(n)  
Kadane’s Algorithm: O(1)

## Key Learning
Prefix sum helps convert subarray problems into range difference problems. Kadane’s Algorithm optimizes this by maintaining running maximum without extra space.

## Edge Cases
- All negative numbers  
- Single element array  
- Large input size  
- Maximum sum subarray at beginning or end
