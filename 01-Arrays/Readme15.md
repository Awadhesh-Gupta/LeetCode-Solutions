# Problem: Product of Array Except Self

## Approach
Used Prefix and Suffix product arrays to compute the product of all elements except the current index without using division. For each position, multiply the product of elements before and after that index.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Key Learning
Prefix and suffix techniques help solve range product problems efficiently and avoid division. This pattern is useful in many array-based optimization problems.

## Edge Cases
- Presence of zero in array  
- Multiple zeros  
- Negative numbers  
- Large input size
