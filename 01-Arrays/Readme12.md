# Problem: Best Time to Buy and Sell Stock

## Approach
Track minimum price while iterating and calculate potential profit for each day; update maximum profit.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
Greedy approach with single pass avoids brute force O(n²) solution.

## Edge Cases
- Prices strictly decreasing → profit = 0  
- Single element array  
- All prices equal
