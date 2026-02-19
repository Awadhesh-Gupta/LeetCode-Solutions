# Problem: Best Time to Buy and Sell Stock II

## Approach
Used greedy strategy to accumulate profit by adding all positive price differences between consecutive days.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
Greedy observation simplifies the problem. Summing all increasing price differences gives the maximum profit.

## Edge Cases
- Strictly decreasing prices → profit = 0  
- Single day price  
- Continuous increasing prices  
- Large input size
