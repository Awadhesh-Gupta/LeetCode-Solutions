# 55. Jump Game

## Problem
You are given an integer array `nums`. You are initially positioned at the array's first index, and each element represents your maximum jump length at that position.
Return `true` if you can reach the last index, otherwise return `false`.


## Approach
Used Greedy strategy by tracking the farthest index reachable while iterating through the array.
Maintain a variable `maxReach`:
- If the current index is greater than `maxReach`, return `false`.
- Otherwise, update:
  
  maxReach = max(maxReach, i + nums[i])
If traversal completes, the last index is reachable.


## Time Complexity
O(n)
## Space Complexity
O(1)

## Key Learning
Tracking the maximum reachable index eliminates the need for recursion or dynamic programming.  
Greedy works because we only care about reachability, not the exact jump path.

## Edge Cases
- Single element array  
- Large jump at beginning  
- Zero blocking the path  
- Strictly decreasing jump values
